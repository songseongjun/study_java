package Lesson12;

import java.io.File;
import java.util.Arrays;

public class StringEx메서드기능 {
public static void main(String[] args) {
	String str ="abcd1234abcd";
	System.out.println(str.length());
	
	
	// indexof (dlanswkdof(이문자열에 위치에 인덱스가 몇번째에있습니까)
	System.out.println(str.indexOf("d"));
	System.out.println(str.indexOf("d2"));// -1을해준다
	System.out.println(str.indexOf("d",4));// 4번인덱스로 부터 오른쪽으로 찾는거임! 11
	System.out.println(str.indexOf("d",4,10));//-1해준다! 시작위치 4번 인덱스 부터 10번 인덱스까지찾아라


	
	
	//last index of
	System.out.println(str.lastIndexOf("d"));//11
	System.out.println(str.lastIndexOf("d",4));//3   4번인덱스 부터 시작 왼쪽으로 가게된다 이건

	
	
	//substring
	System.out.println(str.substring(4));//매개변수 start위치(인덱스)에서 끝까지 잘라냄
	System.out.println(str.substring(4,10));//매개변수 start위치부터 end위치 전 인덱스까지 잘라냄
	
	//"첫번째" c에서 부터 마지막 c 위치까지 문자열 자르기
	// cd1234ab
	System.out.println(str.substring(str.indexOf("c"),str.lastIndexOf("d")));
	
	
	System.out.println(str.toUpperCase());//대문자 화 시켜주는거임!!
	

	
	//문자열 매개변수 str시작하면 true
	// startwith와 endwith를 사용해서
	//확장자가 txt인파일을 출력
	//파일명이 abcd인 파일만 출력
	String []fileNames = {"abcd.txt","1234.txt","abcd.exe","abcd.bin"};
	for(int i=0; i<fileNames.length;i++) {
		if(fileNames[i].endsWith(".txt"))
			if(fileNames[i].startsWith("abcd"))
		System.out.println(fileNames[i]);
		File dir =new File("C:\\Users\\TJ\\workspace_Java_ssj");
	System.out.println(dir.isFile());
	System.out.println(dir.isDirectory());
	
	
	//lesson으로 시작하지 않는 이름만 출력
	String [] list=dir.list();
	for(String s:list) {
		if(!s.startsWith("lesson")) {
		System.out.println(s);
		 }
	   }
	System.out.println("=========================");
	//문자열  > 문자열배열 로바꿈
	String[] strs ="123123123".split("2");// 2을 넣으면 {"1,",",31","3"}로 출력됨 넣은 2구분자가빠지고 남는 공백사이에 1,3이붙여짐
	System.out.println(Arrays.toString(strs));
	//문자열 배열  > 문자열 로바꿈  (위에껄 하나의 문자열로 바꾸는 애가 이친구)
       String str3=String.join("+", strs);
       System.out.println(str3);

	 }
	//문자열> 문자 배열 로바꿈
		char[]chs=str.toCharArray();
		for(int i = 0; i<chs.length; i++) {
			System.out.println(chs[i]); 
		}
		//문자열 배열> 문자열 로바꿈
		String str2 =new String(chs);
		System.out.println(str2);
   } 
}

