package Lesson9_1;

import java.util.Arrays;

public class Anonymous {
public static void main(String[] args) {
	//익명 (생성자가 없다 클래스이름이 없어서)
	//가장 많은 예시가 인터페이스를 이용함
	Runnable runnable =new Runnable() {
		int i=10;
		static int si =20;
		@Override
		public void run() {//<< 여기는 클래스구간 메서드를 선언할수있어서 
			// TODO Auto-generated method stub
			System.out.println("실행");
		}
		// 익명클래스는 인스턴스변수 사용가능 클래스변수는 사용할수없음 클래스 이름이 있지않아서
		void m() {
			System.out.println(i);
		}
		void m2(int i) {
			i=20;
		}
	};
	Outer outer =new Outer();{
	void m(){
		System.out.println("오버라이드 메서드");
	}
	};
outer.m();

Integer[]arr = {1,5,3,2,4,1};
comparator<Integer>iter=new comparator<Integer>() {
	@Override
	public int compare(Integer o1,Integer o2) {
		//Toop Auto-generatedmethod stub
		return o1-o2;
	}
};
Arrays.sort(null);
}
}
