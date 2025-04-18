package Lesson10;

public class Lesson11 {
public static void main(String[] args) {
	//  try  catch  finally   throw   throws
     int i =1;      
     try {          //예외상황이 발생시 try블럭안에 예외상황넣음 그리고 밑에 catcch안에케치해서출력해줌
	System.out.println(1);   
	System.out.println(args[0]);//exception예외상황   
	System.out.println(3/0);//exception  예외상황 
	System.out.println(4);
     }
     catch (NullPointerException e){ //
	System.out.println(5); 
     }
     catch (ArithmeticException e){ //예외상황을 많이쓸라면  위쪽에자식을 쓰고 아래쪽에 조상타입을써야한다
	System.out.println("a"); 
     }
          catch (RuntimeException e){ //
    		System.out.println("b");
     }
     finally {
		
	}
     
	System.out.println(6);    
 

      }
  }
