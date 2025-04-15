package Lesson08;

public class Student {
	//필드는 3개다 String, int ,String
	String name;
	int grade;
	String department;
	
	Student(){}
	
	Student(String n,int g, String d){//앞에 Student가 클래스명 (  )안에 들어간게 매개변수   
		//애네가 다 기본생성자
		name = n;//실행문
		grade = g;//실행문
		department =d;//실행문
	}

}
