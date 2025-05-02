package service;

import Utils.BankUtils;
import domain.Customer;

public class Bankservice {

	private static Bankservice bankservice = new Bankservice();

	private Bankservice() {
	}

	public static Bankservice getInstance() {
		return bankservice;
	}

	private CustomerService customerService = CustomerService.getInstance();
private AccountService accountService =AccountService.getInstance();
	public void menu() {

		if (customerService.getLoginCustomer() == null) {
			int no = BankUtils.nexInt("1.회원가입2.로그인");

			switch (no) {
			case 1:
				customerService.register();
				break;
			case 2:
				customerService.login();
				break;
			}
		} else {
			System.out.println("로그인 상태");
			int no=BankUtils.nexInt("1.내정보보기 2.정보수정3.회원탈퇴 4.개설 5.입금 6.출금 7.이체 8.해지9.로그아웃");
			
			switch (no) {
			case 1:
				customerService.mypage();break;
			case 2:
				customerService.modify();break;
			case 3:
				customerService.remove(); break;
			case 4:
				accountService.open(); break;
			case 5:
				accountService.deposit();break;
			case 6:
				accountService.withdraw();break;
			case 7:
				accountService.transfer(); break;
			case 8:
				accountService.close(); break;
			case 9:
				customerService.logout(); break;
			}
		}
	}
}
