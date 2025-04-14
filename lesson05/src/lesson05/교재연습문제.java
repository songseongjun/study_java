package lesson05;

import java.util.Scanner;

public class 교재연습문제 {
	public static void main(String[] args) {
/* 1번 */ int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				sum += +i;
			} 
		}
         System.out.println(sum);
/* 2번 */ int evensum = 0;
		int oddsum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evensum += i;
			} else {
				oddsum += i;
			}
		}
		System.out.println("짝수합계는" + evensum);
		System.out.println("홀수합계는" + oddsum);

		// 교재3번문제
		 for (int x = 1; x <= 6; x++) {
		 for (int y = 1; y <= 6; y++) {
			  if (x + y == 6) {

		 System.out.println("(" + x + ", " + y + ")");
				}

			}

		}
		// 교재 7번문제
		int count = 0;
		int dice = 0;

		while (dice != 6) {
			dice = (int) (Math.random() * 6) + 1;
			count++;
			System.out.println("굴린 주사위수: " + dice);
		}

		System.out.println("6이 나올 때까지 주사위를 굴린 횟수: " + count + "번");

		// 문제4번
		//선생님이푼거
//		for (int i = 0; i < 5; i++) {
//
//			for (int j = 0; j <= i; j++) {
//				if(j>=i)여기를 바꿔주면 반대쪽도되고 한다 {
//					System.out.printf("(%d,%d)",i,j);
//				}
//				else {
//					System.out.printf("%5c"/*공백5칸해라*/," ");
//				}
//	         }
			
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		// 문제 5번
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		// 문제6번
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; i++) {
				System.out.print(" * ");
			}

			System.out.println();
		}

	}

}