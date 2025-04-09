package lesson01;

/**
 * @author 박종민
 * @seince 1.0.1
 */
public class HelloWorld {
	//main ctrl+space
public static void main(String[] args/*변수명*/) {
	// sout ctrl+space
	System.out.println("HelloWorld");//실행코드 ctrl + F11
	//camel//snake(카멜표기 2글자 이상단어들은 이걸씀)
	String name ="송성준";
	System.out.println(name);
	System.out.println(name.lastIndexOf("송"));
}
}