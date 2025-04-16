package student;
//데이터 클래스 Data class
public class Student {
	// 1.Student Main의 나머지 기능구현 (메세지출력)
	//2. Student의 생성자 구현
	//3.기본생성자+ (학번, 이름),(다섯개의 필드를 다 사용)3개만들라는것	
	//4.학생 1인의 총점, 평균을 계산한다면?
	//어떻게 처리 할건지?
 int no;
 String name;
 int kor;
 int eng;
 int mat;
  Student(){} //기본생성자
  Student(int no, String name) {
      this.no = no;
      this.name = name;
  }
  public Student(int no, String name, int kor, int eng, int mat) {
      this(no,name);
      this.kor = kor;
      this.eng = eng;
      this.mat = mat;
  }
  int total() {
	  return (kor+eng+mat);
  }
  
  double average(){
  int count=3;
  int total=(kor+eng+mat);
  double average=total/count;
  return(average);
  //평균 계산 double type
}
}