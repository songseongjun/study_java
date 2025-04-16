package lesson07;

public class Ins인스턴스 {
	
	
public static void main(String[] args) {
	String str=new String();
	// 1. String:구조상:클래스 문법적으로:데이터타입!
	// 2. str:객체이자 지역변수임!,객체는 이름임!
	// 3. =:대입 연산자 
	// 4. new :연산자,인스턴스 생성 트리거 이다!(생성자를필요로한다)
	// 5. String(): 생성자 호출 문구이다!!(기본생성자도맞음!)
	
	// 4번 +5번은 :새 인스턴스 생성 
    str.length();//이걸 밑에껄로 바꿀수도있음
    new String().length();
    
    String s;//이거랑 밑에꺼 둘다 객체고 지역변수이다ㄴ
    String s2=null;// null은 인스턴스 미할당객체이다
    
}
}
