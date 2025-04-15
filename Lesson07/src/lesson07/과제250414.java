package lesson07;

import java.util.Arrays;
import java.util.Random;

public class 과제250414 {
	public static void main(String[] args) {
		
	
//피보나치 수열출력
	//반복문관련
	//피보나치 수열 숫자 20개출력 fibo
	//규칙 첫 두자리 숫자의 합이 다음 숫자의 합, 그다음 숫자는 이전 두숫자의합의 연속
	// 1 1 2 3 4 5 13 21 44 65 109 .....
		//선생님이 푼 풀이
//		int a=1;
//		int b=1;
//		System.out.println("1 1");
//		for(int i =0; i<20;i++) {
//			int c=a+b;
//			System.out.println(c+" ");
//			a=b;//1
//			b=c;//2
//		}
		int n= 20;
		int [] fibo = new int[n];
		fibo[0]=1;
		fibo[1]=1;
		for (int i = 2; i <n ; i++) {
			fibo[i]= fibo[i-2]+fibo[i-1];
		}
		for(int i=0; i<n; i++) {
			System.out.print(fibo[i]+"  ");	
		}
// 2. 50개의 길이를 가지는 정수 배열생성,각 값은 1~20사이의 숫자로 채우기
	//이후 중복된 값을 제거한 새로운 배열을 생성
		int[]arr=new int[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*20+1);
			}  
		System.out.println(Arrays.toString(arr));
			int[]tmp =new int[20];
			
			System.out.println(Arrays.toString(tmp));
			int length=0;
			
			for(int n1 : arr) {
			boolean insert=true;
			for(int i =0; i<length;i++) {
			if(n==tmp[1]) {
				insert=false;
				break;
			}
		}
			if(insert) {
				tmp[length++]=n;	
			}
			System.out.println(Arrays.toString(tmp));
			tmp=Arrays.copyOf(tmp, length);
			System.out.println(Arrays.toString(tmp));
		
//3. 2차원 배열
	/*
	 * **
	 * **
	 * **
	 * *****
	 * *****
//	 */
 char[][]char = {for (int i = 5; i >= 1; i--) {
		for (int j = 1; j <= i; j++) {
			System.out.printf("*");
		}
		System.out.println();
	}
		 {'*','*',' ' ,' ',' ' },
		 {'*','*',' ',' ',' ' }
		 {'*','*',' ' ,' ' ,' ' },
		 {'*','*','*','*','*'},
		 {'*','*' , ' ',' ', ' ' },
 };
 //90도 시계방향 회의 결과를 result에 담으시오
 char[][] result2= new char[5][5];
 for (int i = 0; i < char.length; i++) {
	  for (int j = 0; j < char[i].length; j++) {
		System.out.println(char[i][j]+" ");
		result2[j][5-1-i]=char[j][i];
	       }
	  System.out.println();
	}			
		for(char[]t :result2) {
			for(char n2 :t) {
				System.out.println(n2+" ");
			}
			System.out.println();
		}
		
	
			int[][]val = {
					{1,2,3,},
					{4,5,6,},
					{7,8,9,},
			};
			int[][] result2=new int [3][3];
			result2[0][2]=val[0][0];//1
			result2[1][2]=val[0][1];//2
			result2[2][2]=val[0][2];//3
			
			result2[0][1]=val[1][0];//4
			result2[1][1]=val[1][1];//5
			result2[2][1]=val[1][2];//6
			
			result2[0][0]=val[2][0];//7
			result2[1][0]=val[2][1];//8
			result2[2][0]=val[2][2];//9
			
			
    
			}
	}
	}


