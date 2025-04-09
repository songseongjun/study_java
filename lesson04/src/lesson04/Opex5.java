package lesson04;

public class Opex5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		boolean c = a == b;
		System.out.println("c:"+c);
		boolean d = c == false;
		System.out.println("d:"+d);
		//가 핳 가에서 힣까지의 글자 숫자는
		System.out.println('힣'-'가'+1);
		
		//AND(&&) :그리고 , 교집합 ,(중요) 둘다 참일때만 참
		// or(||): 혹은, 합집합, (중요) 둘다 거짓일때만 거짓
        
		// boolean  e
		// a의값이 양수 이면서 20보다 작은지
		boolean e = a>0 && a<20;
		System.out.println(e);
		
		//a의값이 홀수 이거나 5의 배수 인지
		e = a % 2 == 1 || a % 5 ==0;
		//논리연산
		// 논리곱&& 논리합|| 논리부정 !
		
		
		//비트연산
		// 비트곱 & 비트합 |  비트부정 ~ 비트배타논리합 ^
		
		System.out.println(9&5);
		System.out.println(9|5);
		System.out.println(9^5);
		
		//9:1001
		//5:0101
		System.out.println(~0);
		
		//1001
		//9<<2 :100100
		
		System.out.println(9<<2);
		System.out.println(9>>2);
		
		System.out.println(-4<<2);
		System.out.println(-4>>2);
		System.out.println(-4>>>2);
		System.out.println(Integer.toBinaryString(-4>>>2));
		a=72/6;
		System.out.println(a);
		
		// A * B  = D
		// D / B = A
	}

}
