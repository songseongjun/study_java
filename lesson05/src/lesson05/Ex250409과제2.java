package lesson05;
//책문제5번
public class Ex250409과제2 {
	public static void main(String[] args) {
	
		int year =2020 ;
		boolean leapYear = year% 4 == 0 && year% 100!= 0 ||year%400==0;
		
		System.out.println(leapYear);
	
		//책문제 6번
		int price = 187_000 ;
		int oman = price /-50_000;
		int iman =price%50000/-10000;
		int ochun =price%10000/5000;
		int ilchun =price%5000/1000;
		System.out.println(oman);
		System.out.println(iman);
		System.out.println(ochun);
		System.out.println(ilchun);
		//책문제7번
		int number = 1234;
		int result = 1234/100*100;
		result = number-number%100;		
		
		
	}

}
