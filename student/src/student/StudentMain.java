package student;

import Lesson08.Student;

public class StudentMain {
public static void main(String[] args) {
//     //사용자로 부터 문자열 입력을 받고싶음
//	String str=StudentUtils.nextLine("값을 입력하세요>");
//	System.out.println(str);
//	
//	//사용자로 부터  숫자를 입력 받고 싶음
//	System.out.println(StudentUtils.nextLine("숫자를 입력하세요>"));
	StudentService service =new StudentService();
	System.out.println("==========학생 점수 관리 프로그램==========");
	for(;;) {
		switch (StudentUtils.nexInt("1.등록 2.조회 3.수정 4.삭제 5.종료")) {
		case 1:
			service.register();
			break;
		case 5:
			System.out.println("bye~!");
		default:
			break;
		
		}
	}
	Student stu =new Student("name",,"소프트웨어공학");
	System.out.println(stu.name);
	System.out.println(stu.grade);
	System.out.println(stu.department);
	
 }
}
