package lesson04;

import java.io.InputStreamReader;

public class Q1 {
	public static void main(String[] args) {
		 //문제1
		int a= 72;
		 int b = 6;
		 int c = a/b;
		System.out.println(c); 
		System.out.println(72/6);
		//문제 2
		int cake = 23;
		int peopele = 4;
		int cup  = cake /peopele;
		int kor =  cake%cup; 
		System.out.println("각 사람은"+cup+"개의 컵케이크를 받는다");
		System.out.println("남는 컵케이크는"+kor+"개입니다");
		System.out.println(23%4);
		
		//문제 3
		int height =148;
		System.out.println(height>=150);
		
		//문제 4
		int score = 10;
		score += 20;
		System.out.println(score);
		//문제 5
		int level =3;
		level++;
	    level++;
		level--;
		System.out.println(level);
		//문제6
		boolean hasID = true;
		boolean hasTicket = false;
		boolean canEnter = hasID && hasTicket;
		//문제 7번
		System.out.println((80+90+70) /3);
		//문제 8번
		System.out.println(a>=20&& isRegistered);
		//문제 9번
		score= 10;
		score =10*3;
		score = 30+5 ;
		score = 35/3;
		//문제10번
		a = 20;
		hasTicket =true;
		boolean isVIP =false;
		canEnter = a>=18&&hasTicket&& !isVIP;
		
		
		
		
		
	}

}
