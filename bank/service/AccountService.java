package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import domain.Account;
import domain.Customer;
import static Utils.BankUtils.*;


public class AccountService {
private List<Account> accounts =new ArrayList<>();

private static AccountService accountService =new AccountService();
private AccountService() {}
public static AccountService getInstance() {
	return accountService;
}
private CustomerService customerService =CustomerService.getInstance();

//개설
public void open() {
	int no =1;
		if(!accounts.isEmpty()) {
			no = accounts.get(accounts.size()-1).getNo()+1;
		}
		accounts.add(new Account(no,customerService.getLoginCustomer(),nextLine("비밀번호>")));
		//if문돌려
	}
//출력
public void print(List<Account>list) {
	for(Account a: list) {
		System.out.println(a);
	}
}

//입금
public void deposit() {
	List<Account> myAccounts=findAccountsBy(customerService.getLoginCustomer());//이거계속쓰이니까기억
	print(myAccounts);
	int no = nexInt("입금할 계좌를 입력하세요");
	Account account =findBy(no);
	if(account ==null) {
		System.out.println("없는 계좌 번호 입니다");
		return;
	}
	//Amount실체받아야하는돈값
	account.setAmount(account.getAmount()+nexlong("입금할 금액을 입력하세여>"));
}
//출금
public void withdraw() {
	List<Account> myAccounts=findAccountsBy(customerService.getLoginCustomer());//이거계속쓰이니까기억
	print(myAccounts);
	int no = nexInt("출금할 계좌를 입력하세요");
	Account account =findBy(no);
	if(account ==null) {
		System.out.println("없는 계좌 번호 입니다");
		return;
	}
	//Amount실체받아야하는돈값
	long amount =nexlong("출금할 금액을 입력하세요>");
	if(account.getAmount()<amount) {
		System.out.println("잔고가 부족합니다");
		return;
	}
		account.setAmount(account.getAmount()-amount);
}
//이체
public void transfer() {
	List<Account> myAccounts=findAccountsBy(customerService.getLoginCustomer());//이거계속쓰이니까기억
	print(myAccounts);
	int no = nexInt("출금할 계좌를 입력하세요");
	Account account =findBy(no);
	if(account ==null) {
		System.out.println("없는 계좌 번호 입니다");
		return;
	}
	//Amount실체받아야하는돈값
	long amount =nexlong("이체할 금액을 입력하세요>");
	if(account.getAmount()<amount) {
		System.out.println("잔고가 부족합니다");
		return;
	}
	
	int targetNo =nexInt("이체 대상 계좌번호를 입력하세요>");
	Account targetAccount =findBy(targetNo);
	if(targetAccount ==null) {
		System.out.println("엾는 계좌 번호입니다");
		return;
	}   //findBy는 for문대신에 쓴것 if는 return값넣어서 줄여준것
	String targetName =targetAccount.getCustomer().getName();
	if(nextConfirm(targetName+"님의 계좌로 입금합니다")) {
		System.out.println("취소되었습니다");
		return;
	}
	account.setAmount(account.getAmount()-amount);
	targetAccount.setAmount(targetAccount.getAmount()+amount);
}
//해지
public void close() {
	List<Account> myAccounts=findAccountsBy(customerService.getLoginCustomer());//이거계속쓰이니까기억
	print(myAccounts);
	int no = nexInt("출금할 계좌를 입력하세요");
	Account account =findBy(no);
	if(account ==null) {
		System.out.println("없는 계좌 번호 입니다");
		return;
	}
	if(!nextConfirm("해지하시겠습니까?(남은잔고는 사라집니다)")) {
		return;
	}
	accounts.remove(account);
}

//입력:고객이되고, 출력:리스트<계좌>가되는것임
	public List<Account> findAccountsBy(Customer c) {
//		List<Account> ret = new ArrayList<>(); 
//			for(Account a: accounts) {  이거오른쪽에있는전체리스트를왼쪽에넣어주는것           //로그인 계좌이용해서 해지하는방법getLoginCustomer가 로그인을가져와서잉요한정보
//				if(customerService.getLoginCustomer() == c) {
//					ret.add(a);	
//				}
//			}
//	return ret;  이방법이 for문돌리는 방법임!!
//	
		return accounts.stream().filter(a -> a.getCustomer() == c).collect(Collectors.toList());
	}
	
	//findBy
	public Account findBy(int no) {
		for(Account a: accounts) {
			if(no == a.getNo()) {
				return a;
			}
		}
		return null;
	}
}


