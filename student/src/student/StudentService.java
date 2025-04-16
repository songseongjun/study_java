package student;

public class StudentService {
  Student[]students =new Student[2];
  int count;
  //{null,null,null,null,null,null,null,null,null,null}
  //2.수정 밑 삭제 기능 구현하기 count써서해보기
  //국어점수 영어점수 수학점수 이어받고 기존값을 덮어씌운다
  //3.배열의 길이를 넘는 추가 학생 등록시 배열 길이 늘리기
  
	//등록
	void register() {
		System.out.println("등록 가능");
		//학생 생성
		//학번,이름,국어,영어,수학
		int no=StudentUtils.nexInt("학번>");
		String name = StudentUtils.nextLine(" 이름> ");
		int kor=StudentUtils.nexInt("국어>");
		int eng=StudentUtils.nexInt("영어>");
		int mat=StudentUtils.nexInt("수학>");
		students[count++]=new Student(no, name, kor, eng, mat);
	
		
	}
	//조회
	void read() {
		System.out.println("조회 가능");
		for (int i = 0; i < count; i++) {
			System.out.println(students[i].no+" ,"+students[i].name+" , "+students[i].total());
		}
	}
	//수정
	void modify() {
		System.out.println("수정 가능");
		for(int i=0; i<count; i++) {
			 int count=0;
			 int no=StudentUtils.nexInt("학번>");
			 String name = StudentUtils.nextLine(" 이름> ");
			 int kor=StudentUtils.nexInt("국어>");
			 int eng=StudentUtils.nexInt("영어>");
			 int mat=StudentUtils.nexInt("수학>");
			 students[count++]=new Student(no, name, kor, eng, mat);
			System.out.println(students[i].no+" ,"+students[i].name+" , "+students[i].total());
		  
		}
	}
	
	//삭제
	
	void remove() {
		System.out.println("삭제 가능");
		for(int i=0; i<count; i--) {
			 int count=0;
			 int no=StudentUtils.nexInt("학번>");
			 String name = StudentUtils.nextLine(" 이름> ");
			 int kor=StudentUtils.nexInt("국어>");
			 int eng=StudentUtils.nexInt("영어>");
			 int mat=StudentUtils.nexInt("수학>");
			 students[count--]=new Student(no, name, kor, eng, mat);
			System.out.println(students[i].no+" ,"+students[i].name+" , "+students[i].total());
		}
		
	}
	
}
