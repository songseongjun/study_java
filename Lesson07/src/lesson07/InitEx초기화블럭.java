package lesson07;

public class InitEx초기화블럭 {

	InitEx초기화블럭(){
	System.out.println("생성자호출");
	}
	static {
		System.out.println("클래스 초기화 블럭 실행");
	}
	{
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	public static void main(String[] args) {
		System.out.println("main 메서드 작성");
		System.out.println("main init1 객체 생성");
		new InitEx초기화블럭();
	     System.out.println("main init2 객체 생성");
     	new InitEx초기화블럭();
        System.gc();
	}
	
}
