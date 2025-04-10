package lesson05;

import java.util.Scanner;

public class ForEx1 {
public static void main(String[] args) {
	
	for (int i=0;i<10; i++) {
		System.out.println("i="+i);
		
		String str ="1234";
		String str2 ="1234";
		//문자열비교할때는 밑에 코드쓰기
		// str.equals(str2)
		//if (str == str2){
	//	System.out.println("같은문자열");
//	                }
		if(str.equals(str2)) {
		System.out.println("같은문자열");
		}
		Scanner scanner =new Scanner(System.in);
		String input = scanner.nextLine();//사용자의 입력을 문자열로 수집
	}
}
}
