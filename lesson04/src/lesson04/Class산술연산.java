package lesson04;

public class Class산술연산 {
	public static void main(String[] args) {
		int a =5+5;
		System.out.println("5+5="+a);
        int b= a-5;
		System.out.println("10-5="+b);
		int c= b*2;
		System.out.println("5*2="+c);
		int d =c/5;
		System.out.println("10/5="+d);
		int e = 10%3;
		System.out.println("10%3="+e);
		//산술연산
        //int보다 작은 타입들, byte,short,char
		char ch1='A';
		ch1=(char)(ch1+1);
		ch1++;
		System.out.println(ch1);
		//double val=1.234567/
		double val =1.234567;
		//100을곱해라
		val=val*100;//123.4567
		//정수로만들어라
		val=(int)val;
		//100을나눠라
		val=val/100;
		
		
		System.out.println(val);
		
		
		
		
		
		
		
	}
}
