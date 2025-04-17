package Lesson9;

public class AbsMain {
public static void main(String[] args) {
	
}
}
abstract class Parent{
	abstract void m();
}
 abstract class Child extends Parent{
	
}
abstract class GrandChild extends Child{
	 void m() {  //이걸써줘서
		 
	 }
 }
class GrandGrandChild extends GrandChild{
	//만약 저위에 조상이 void로 저걸 안만들어줬으면 애가 해야ㄴ
}