package Lesson10;

import java.util.concurrent.ExecutionException;

public class ExceptionEx {
public static void main(String[] args) {
    try{
    	m();
    }
    catch (Exception e){
    	System.out.println("main catch");
    }
}

	
	
static void m() {      //예외가 발생되고 나서 try에  예외상황이있는지확인하고 catch에있는것들이 캐치함
	try { 
		System.out.println(1);
		System.out.println(2/0);
		System.out.println(3);
		
	}
	finally {   //애는 반드시 호출을하고되돌아간다
		System.out.println(4);
	}
	System.out.println(5);
}

}
