package lesson05;

import java.util.Scanner;

public class Hun {
	public static void main(String[] args) {
		//한글갯수
//		System.out.println('힣'-'가'+1);//11172
//		//초성 당 글자 갯수
//		System.out.println('힣'-'하'+1);//588
//		//초성갯수
//		System.out.println(11172/588);
//		System.out.println(19*588);
//		// 종성간 거리
//		System.out.println('개'-'가');
//		//특정 글자가 받침이 있는지 없는지 boolean
//		/*(가-가%28)하면받침이없는게나옴,그럼 저 첫번째가에서 받침이있는지없는지확인할려면 그글자를넣음*/
//		char ch='나';
		// System.out.println((ch-'가')%28!=0);
		Scanner scanner = new Scanner(System.in);
		System.out.println("단어를입력하세요>");
		String inputStr=scanner.nextLine();
		//문자열의 내의 특정위치의 글자하나만 char로변환
		char ch=inputStr.charAt(inputStr.length()-1);
		 boolean hasLast =(ch-'가')%28!=0;
		 String output="사용 단어의 예시는 아래와 같습니다\n";
		 output += inputStr+(hasLast?"은":"는")+"\n";
		 output += inputStr+(hasLast?"이":"가")+"\n";
		 output += inputStr+(hasLast?"을":"를")+"\n";
	}

}
