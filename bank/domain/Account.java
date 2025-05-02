package domain;

import java.util.Date;

public class Account {
    //계좌번호
    private int no;
	//잔고
    private long amount;
	//회원
    private Customer customer; //이녀석이 회원번호 통채로가져옴
	//계좌비밀번호
    private String pw;
    //한도액수
    private long limit=1_000_000;//이건 1회기준임
	//개설일
    private Date date = new Date();//애는바로받을필요없어서
    //기본생성자 만드는법 ctrl+스페이스바 누르면됨
   
    public Account() {
	
	}
	    
    //기본생성자 만드는방법alt+s하고 a누르면됨 //여기서 없애주고
	public Account(int no, Customer customer, String pw) { //여기가 계좌생성에필요한것들가져오는부분
		this.no = no;
		this.customer = customer;
		this.pw = pw;
//		this.date = new Date();//여기서 직접받게 객체를생성 했는데 여기도필요없어서 저기위에 그냥객체생성해서만들어줌
	}


	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public long getLimit() {
		return limit;
	}
	public void setLimit(long limit) {
		this.limit = limit;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return String.format("Account [no=%s, amount=%s, customer=%s, pw=%s, limit=%s, date=%s]", no, amount, customer,
				pw, limit, date);
	}
	   
}
