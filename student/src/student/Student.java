 package student;
//데이터 클래스 Data class
public class Student {
	
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
  //평균 계산 double type
  double average() {
      return total() / 3.0; 
  }

 
}
