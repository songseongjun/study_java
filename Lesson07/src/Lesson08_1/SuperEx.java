package Lesson08_1;

public class SuperEx {
public static void main(String[] args) {
	new Child().print();
//	Child child =new Child();
//	child.print(); 이 주석을 간추려서 한게 저위에꺼임!
//	Class cls =SuperEx.class//이건 클래스 리터럴 값 클래스를 클래스한다는것 설계도만들때사용
			                 //아직사용 안하니 주의깊게안봐도됨ㄴ
     }
}
class Parent extends Object{
	int number =3;// 여기서는 3이 리터럴 값 (어떤객체에 들어갈거임)
	Parent(int i){
		super();
		System.out.println("부모 객체 생성");
	}
}
class Child extends Parent{
	int number = 2;
	Child(){
		super();
		System.out.println("자식 객체 생성");
	}
	void print() {
		int number = 1;//1첫번째 프린트에서 1이출력되는 이유는 애가 좀더 scoup라서애가출력됨
		System.out.println(number);// 메서드 지역변수 number
		System.out.println(this.number);//자신 객체의 number
		System.out.println(super.number);//부모 객체의 number
	}
}