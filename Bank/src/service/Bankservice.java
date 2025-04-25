package service;

import BankUtils.BankUtils;
import domain.Customer;

public class Bankservice {

	private static Bankservice bankservice = new Bankservice();

	private Bankservice() {
	}

	public static Bankservice getInstance() {
		return bankservice;
	}

	private CustomerService customerService = CustomerService.getInstance();

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
			int no = BankUtils.nexInt("1.로그아웃");
			switch (no) {
			case 1:
				customerService.logout();
				break;
			}
		}
	}
}
