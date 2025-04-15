package student;


//데이터 클래스 Data class
public class Student {
	// 1.Student Main의 나머지 기능구현 (메세지출력)
	//2. Student의 생성자 구현
	//3.기본생성자+ (학번, 이름),(다섯개의 필드를 다 사용)3개만들라는것	
  int no;
  String name;
  int kor;
  int eng;
  int mat;
  Student(){}
  Student(String n,int g,int d, int f){
  name = n;
  kor = g;
  eng=d;
  mat=f;
  }
  }
