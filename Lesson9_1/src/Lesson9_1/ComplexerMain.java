package Lesson9_1;

public interface ComplexerMain {
public static void main(String[]args) {
	Complexer com =new Complexer();
	System.out.println(Complexer.INK);
	System.out.println(Complexer.fAX_NUMBER);
	
	
	com.print();
	com.scan();
	com.send("02-8765-4321");
	com.receive("02-8765-4321");
	Comparable<?>c;/*<<클래스가 구현될목적>*/
	Comparator<?>c2;/*<객체를 생성할목적>*/
	
	Iterable<?>i;/*반복하다,,반복자 객체를만들목적*/
	Iterator<?>i2;
}
}
