package Lesson08_1;

public class Bindung {
public static void main(String[] args) {
	A obj=new B();//이친구는 출력하면 B가나옴 이유는 new새로운생성자로되서ㄴ
                    // A는 B를호출할수있지만 B는A를호출못함
    System.out.println(obj);
    System.out.println(obj.si);
    System.out.println(obj.i);
    obj.sm();
    obj.m();
/////////////////////////////////////////////
    A a=new A();
    B b=new B();
    
    
    A c=b;//
//    B d=a;
//    
    B e=(B)c; //e는 타입이B입니다 B e=c;가안되는건 c인스턴스가 부모타입이라 자식타입에 들어갈수없어서
             //앞에 자식타입인B를넣어주면 실행된다

}
}

class A{
	static int si =1;
	int i=2;
	static void sm() {System.out.println("A.sm()");}
	void m() {System.out.println("A.m()");}
}
class B extends A{
	static int si =3;
	int i=4;
	static void sm() {System.out.println("B.sm()");}
	void m() {System.out.println("B.m()");}
}