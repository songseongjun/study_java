package lesson05;

import java.util.Scanner;

public class IFex7가위바위보랜덤하는법 {
	public static void main(String[] args) {
		System.out.print("가위(1),바위(2),보(3) 중 하나를 선택하세요>");
		Scanner scanner =new Scanner(System.in);
		int me =scanner.nextInt();
		System.out.println(me);
		
		int com =(int)(Math.random()*3+1);// 0이상 1미만의 값> 0이상 3미만 >1이상 4미만> 정수화
		System.out.println(com);
		
		System.out.println(me-com);
//		String[] values = {"가위","바위","보"};
//		System.out.println("내가낸것" +values[me-1]+", 컴퓨터가 낸것:"+values[com-1]);
		switch(me -com){
			case 1:
				System.out.println("승리");
			break;
		    case  -2:
		    	System.out.println("승리");
		    break;
		    case -1:
		    	System.out.println("패배");
		    break;
		    case 2:
		    System.out.println("패배");
		    case 0:
		    	System.out.println("비김");
// switch는 case를 동시에 두개 쓸수도있다 예시) switch(me-com)쓰고 case1: case2:이렇게같이쓸수있음
		
		    	
		    	
		    	
		      //주사위 돌릴때 확률
		    	//0.0      0.0  6씩곱해주면된다.
 		    	//0.1      0.6
		    	//0.2      1.2
		    	//0.3      1.8
		    	//0.4      2.4
		    	//0.5      3.0
		    	//0.6      3.6
		    	//0.7      4.2
		    	//0.8      4.8
		    	//0.9      5.4
	
		    	
		    	
		    	
		}
		
	
	}

}
