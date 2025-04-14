package lesson06_2;

import java.util.Arrays;

public class 과제250411 {
public static void main(String[] args) {
	//1번문제 187000원(배열사용)
	//50000,10000,5000,1000의 돈 단위를 이용해,사용된 지폐의 갯수 계산
	int money =187000;
	int[]units = {50000,10000,5000,1000};
	int[]count = new int[units.length];
	count[0] =money/units[0];//3=187000/50000
	money%= units[0];//187000=>37000
	for (int i = 0; i < units.length; i++) {
	count[1] =money/units[1];
	money%=units[1];
	System.out.printf("%d원%장",units[i],count[i]);
	}
	System.out.println(Arrays.toString(count));
	System.out.println(money);
	// 이하 코드 작성후갯수출력
	//2번 임의의 문자열 생성, CAPTCHA생성(String사용)
	//문자열의 범위는 숫자 ,영대 ,영소 10글자
	String captche ="";
	char[]captcha = new char[10];
	//난수의범위 0~61
	//0~9 그대로 숫자
	//10~35까지는 영대
	//36이상은 영소
	for (int i = 0; i < 10; i++) {
		int ch = (int)(Math.random()*62);
		if(ch<10){ //숫자
		captcha[i]=(char)(ch+'0'-0);
	}
	else if(ch<36) { //영대 10 A 65
		captcha[i] +=(char)(ch+'A'-10);
	}
	else {  //영소 36 97
		captcha[i] +=(char)(ch+'a'-36);
	}
	}
	System.out.println(captcha);
	
	//3번. 배열의 임의값채우기 (랜덤배웠던거쓰기)
	//100개의 공간을 가지는 배열(0~9사이의 아무 값)
	//(0,1,1,1,3,2,1,1,3,2,.................)
	int[]arr=new int[100];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=(int)(Math.random()*10);
	}
	System.out.println(Arrays.toString(arr));
	int[] counts =new int[10];
	counts[arr[0]]++;
	counts[arr[1]]++;
	//[1,0,0,2,0,0,1,0,0]
	for (int i = 0; i < arr.length; i++) {
		counts[arr[i]]++;
	}
	System.out.println(Arrays.toString(arr));
	// 3-2빈도수 구하기 (위에꺼이용해서)
	// 배열의 길이는10
}
}
