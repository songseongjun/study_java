package Lesson9_1;

public class InnerMain {
public static void main(String[] args) {
	Outer outer =new Outer(); 
	Outer.Inner i;
	 Outer.SInner si;
	 i = outer.new Inner();
	 si =new Outer.SInner();  
  }
}
class Outer{
	  class Inner{//인스턴스 클래스
		
	  static class SInner{//스택틱 클래스
		  
	  }
	  void m() {
		  class Local{//지역클래스
			  
		  }
	  }
	  }
	  
}
