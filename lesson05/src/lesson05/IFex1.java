package lesson05;

import java.util.Scanner;

public class IFex1 {
	public static void main(String[] args) {
		//콘솔을 통한 값 입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("시험점수입력>");
		int score =scanner.nextInt();
	
		System.out.println("시험시작");
		if (score>=60) {
			System.out.println("합격입니다.");
		} 
		else {
			System.out.println("불합격입니다");
		}
		
         System.out.println("시험 끝");	 
  
         
        
	}
	

}
