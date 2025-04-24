package Lesson15;

public class LambdaEx {
public static void main(String[] args) {
	MyInter inter = i -> i * i;             //추상메서드하나를가지게되면 람다식조건가능	
	
	System.out.println(inter.la(10));
	
		
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
Object o2 =(MyInter) i->i*i;
Runnable runnable =()-> {
	System.out.println("Runnable");
};


}

@FunctionalInterface//(함수형인터페이스)이건 하나만 추상메서드를 가져야한다
interface MyInter{
	int la(int i);//애가 추상메서드
	
	
}