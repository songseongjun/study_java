package Lesson12;

public class WrapperEx {
public static void main(String[] args) {
	 int i=10;
	 Integer i2 =20;
	 
	 System.out.println(i+i2);
	 //기본형 > wrapper (boxing) 자동으로 ㅎㅐ줘서 안해줘도 상관없음 위에껄로하삼
	 Integer i3 =Integer.valueOf(i); //원래 정식문법 값!
	 //wrapper >기본형(unboxing)// 자동으로 ㅎㅐ줘서 안해줘도 상관없음 위에껄로하삼
	 int i4 =i3.intValue();	 
	 //auto boxing
	 Integer i5 =i;
	 int i6=i5;
	 
	 
	 m(10L);
	 m(Long.valueOf(10));
	 m((long)i6);
	 
	 int i7 =Integer.parseInt("1234");//.parseInt만 외우자 정수값을 문자열로 바꾸고싶다 할때 이걸써준다
	 Integer i8 =Integer.valueOf("1234");
	 long l = Long.parseLong("1234");// .parseInt 만 외우자 롱타입을 문자열로 바꾸고싶을때 이걸써줌
   
	 String input = "";
	 boolean b =input.equals("y");
			 System.out.println(b);
	 
     }
	 static void m(Long l) {
		 
	 }
}


