package lesson07;

import java.util.Arrays;

public class 과제250414 {
	public static void main(String[] args) {
		
	
//피보나치 수열출력
	//반복문관련
	//피보나치 수열 숫자 20개출력 fibo
	//규칙 첫 두자리 숫자의 합이 다음 숫자의 합, 그다음 숫자는 이전 두숫자의합의 연속
	// 1 1 2 3 4 5 13 21 44 65 109 .....
		int n= 20;
		int [] fibo = new int[n];
		fibo[0]=1;
		fibo[1]=1;
		for (int i = 2; i <n ; i++) {
			fibo[i]= fibo[i-2]+fibo[i-1];
		}
	 System.out.print(fibo+" ");
		
		
		
		
	
// 2. 50개의 길이를 가지는 정수 배열생성,각 값은 1~20사이의 숫자로 채우기
	//이후 중복된 값을 제거한 새로운 배열을 생성
		int[]arr=new int[50];
		int[]tmp =new int[arr.length*2];
		for(int i=0; i<arr.length;i++) {
			tmp[i]=arr[i];      
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*20+1);
		
		}
		System.out.println(Arrays.toString(arr));
		
//3. 2차원 배열
	/*
	 * **
	 * **
	 * **
	 * *****
	 * *****
//	 */
// char[][]chs = {for (int i = 5; i >= 1; i--) {
//		for (int j = 1; j <= i; j++) {
//			System.out.printf("*");
//		}
//		System.out.println();
//	}
//		 {'*','*',' ' ,' ',' ' },
//		 {'*','*',' ',' ',' ' }
//		 ,
//		 {'*','*',' ' ,' ' ,' ' },
//		 {'*','*','*','*','*'},
//		 {'*','*' , ' ',' ', ' ' },
// };
 //90도 시계방향 회의 결과를 result에 담으시오
// char[][] result= new char[5][5];
}
}
