package Lesson10;

public class Exception예외상황발생 {
public static void main(String[] args) {
	System.out.println("프로그램 시작");
	try {
		throw new Exception("에외상황발생");
	}
	catch(Exception e){
//		System.out.println(e.getMessage());
//		e.printStackTrace();
		StackTraceElement[]ste=e.getStackTrace();
		for(StackTraceElement st:ste) {
			System.out.println(st.getLineNumber());
		}
	}
	System.out.println("프로그램종료");
}
static void m() { throws Exception{
	System.out.println(1);
throw new Exception("m의예외"); 
	
}
     catch(Exception e) {
    	 e.printStackTrace();
}
}
}