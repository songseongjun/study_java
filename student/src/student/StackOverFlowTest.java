package student;

public class StackOverFlowTest {
public static void main(String[] args) {

	
//	new Data();
//	new Data();
//Class.forName("lesson16.Data");
//	Data.print(10);
//	Data.print(10);
//	Data.print(10);
//	Data.print(10);
	
	int i = Data.si;
         }
}
class Data{
	
	int i= print(1);
	static int si =print(2);
// Data data =new Data();	
 {
	System.out.println("초기화 블럭"); 
 }
 static {
	 System.out.println("클래스 초기화 블럭");
 }
 public Data() {
	 System.out.println("생성자");
 }
 static int print(int i) {
	 System.out.println("print 호출됨::"+i);
	 return i;
   }
}
