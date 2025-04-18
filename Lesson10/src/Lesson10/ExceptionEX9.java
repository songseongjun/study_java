package Lesson10;

import java.util.Scanner;

public class ExceptionEX9 {
static String userId ="sp";
static String userPw ="smg1234";
public static void main(String[] args) throws LoginException{
	Scanner scanner = new Scanner(System.in);
	System.out.println("아이디:");
	String inputId =scanner.nextLine();
	System.out.println("비밀번호:");
	String inputPw =scanner.nextLine();
	if(! userId.equals(inputId)) {
		throw new LoginException("아이디가 올바르지않음");
	}
	else if(! userPw.equals(inputPw)) {
		throw new LoginException("비밀번호가올바르지않슴");
	}
	else {
		System.out.println("로그인성공");
	}
}
}
