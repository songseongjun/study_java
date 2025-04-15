package Lesson08;

public class MethodEX {
public static void main(String[] args) {
	int result=add(10,20);
	System.out.println(result);
	print("Hello");
	System.out.println(addAll(1,2,3));
	// Stack(후입선출, 들어간순서반대로나옴)
	return;
}
    static int add (int a,int b)/*이부분이 매개변수 */{
    	return a+b; 	
    }
    
    static int addAll(int...nums) {
    	int ret=0;
    	for(int n:nums) {
    		ret += n;
    	}
    	return ret ;
    	
    }
    
    
    static void print(String s) {
    	System.out.println(s);
    }
}