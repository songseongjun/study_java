package Lesson12;

public class StringEx2 {
public static void main(String[] args) {
	String str ="";
	long start =System.currentTimeMillis();
	System.out.println(start);
	//currentTimeMillis();이란
	//1970 .1. 1. 00:00시작
	// 현재까지 흘러간 ms
	for(int i=0; i<300000; i++) {
		str += "0";
	}
	long end = System.currentTimeMillis();
	System.out.println(end);
	System.out.println(str.length());
	
	System.out.println(end - start +"ms");
	
	System.out.println("==============String Buffer===================");
	start = System.currentTimeMillis();  //String Buffer >> 변경이 잦을때는 이걸사용
	StringBuffer sb =new StringBuffer();// 연산이 들어가면String Buffer사용 
	for(int i =0; i<300000; i ++) {
	sb.append("0");
	}
	end= System.currentTimeMillis();
	System.out.println(sb.length());
	System.out.println(end - start +"ms");
	// String >  String Buffer
	StringBuffer sb2 =new StringBuffer(str);
	// String <  String Buffer
}
}
