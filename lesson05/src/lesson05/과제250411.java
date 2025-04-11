package lesson05;

public class 과제250411 {
public static void main(String[] args) {
	//1번문제 187000원(배열사용)
	//50000,10000,5000,1000의 돈 단위를 이용해,사용된 지폐의 갯수 계산
	int[]units = {50000,10000,5000,1000};
	int[]count = new int[units.length];
	for(int i=0; i<units.length;i++) {
	int price = 187_000 ;
	int oman = price /-50_000;
	int iman =price%50000/-10000;
	int ochun =price%10000/5000;
	int ilchun =price%5000/1000;
	System.out.println(oman);
	System.out.println(iman);
	System.out.println(ochun);
	System.out.println(ilchun);}
	// 이하 코드 작성후갯수출력
	//2번 임의의 문자열 생성, CAPTCHA생성(String사용)
	//문자열의 범위는 숫자 ,영대 ,영소 10글자
	//3번. 배열의 임의값채우기 (랜덤배웠던거쓰기)
	//100개의 공간을 가지는 배열(0~9사이의 아무 값)
	//(0,1,1,1,3,2,1,1,3,2,.................)
	// 3-2빈도수 구하기 (위에꺼이용해서)
	// 배열의 길이는10
	//교제 연습문제 111p
}
}
