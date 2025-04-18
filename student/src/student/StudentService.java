package student;

import java.util.Arrays;
//1.모든필드 ,메서드 ,생성자 >>접근제한자 만들기 public같은것들붙이기  필드는 프라이드 메서드는 퍼블릭
//2. 어떤 값을 입력하더라더 예외처리(프로그램 종류는 정상종료)
//3. 점수값 입력을 범위 0~100사이만 인정   Ex)예외로핤ㅜ도있고 조건문으로 할수도있다
//4. 이름 입력은 한글만 인정, 2글자~4글자사이  Ex)예외로핤ㅜ도있고 조건문으로 할수도있다
//5. 임시데이터(개동이,말동이 소동이가 임시데이터) 의 값을 랜덤으로 배정(60~100)
public class StudentService {
	public Student[] students = new Student[4];
	public Student[] sortedStudents = new Student[students.length];
	int count;

	{
		students[count++] = new Student(1, "개똥이", 90, 80, 90);
		students[count++] = new Student(2, "새똥이", 80, 80, 90);
		students[count++] = new Student(3, "말똥이", 10, 80, 90);
		students[count++] = new Student(4, "소똥이", 100, 100, 90);
		
		sortedStudents = students.clone();
		rank();
		
	}
	
	
	
	
	// 입력 : 학번
	// 출력 : 학생
	Student findBy(int no) {
		Student student = null;
		try {
		throw new Exception("에외상황발생");}
		catch(Exception e){
		StackTraceElement[]ste=e.getStackTrace();
		
		for(StackTraceElement st:ste) {
			System.out.println(st.getLineNumber());
		}
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				student = students[i];   
				break;	 
			}
				
			}
		}
		return student;
	}
	
	
	// 등록
	public void register() {
		System.out.println("등록 기능");
		// 학생 생성
		// 학번, 이름, 국어, 영어, 수학
		int no = StudentUtils.nexInt("학번 > ");
	       //학생점수 랜덤 변경
		 String Student[]sts int[]arr=new int[40]);
		for (int i = 60; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*40);
		}
		System.out.println(Arrays.toString(students));
		int[] counts =new int[10];
		counts[arr[0]]++;
		counts[arr[1]]++;
		for (int i = 0; i < arr.length; i++) {
			counts[arr[i]]++;
			System.out.println(Arrays.toString(students));
		}
		
		
		int no1;
		Student s = findBy(no1);
		
		if(s != null) {
			System.out.println("중복된 학번이 존재합니다");
			return;
		}
		
		String name = StudentUtils.nextLine("이름 > ");
		int kor = StudentUtils.nexInt("국어 > ");
		int eng = StudentUtils.nexInt("영어 > ");
		int mat = StudentUtils.nexInt("수학 > ");
		if(students.length == count) {
			students = Arrays.copyOf(students, students.length * 2);
		}
		students[count++] = new Student(no1, name, kor, eng, mat);
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
		
	}
	// 조회
	public void read() {
		System.out.println("조회 기능");
		print(students);
	}
	public void readOrder() {
		System.out.println("석차순 조회 기능");
		print(sortedStudents);
	}
	
	public void print(Student[] stu) {
		for(int i = 0 ; i < count ; i++) {
			System.out.println(stu[i]);
		}
	}
	
	// 수정
	public void modify() {
		System.out.println("수정 기능");
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = StudentUtils.nexInt("수정할 학생의 학번 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		s.name = StudentUtils.nextLine("이름 > ");
		s.kor = StudentUtils.nexInt("국어 > ");
		s.eng = StudentUtils.nexInt("영어 > ");
		s.mat = StudentUtils.nexInt("수학 > ");
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();	//복제하고 정렬해라
	}
	// 삭제
	public void remove() {                //변수
		System.out.println("삭제 기능");       
		int no = StudentUtils.nexInt("삭제할 학생의 학번 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i+1, students, i, count-- - 1 - i);
				break;
			}
		}
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
	}
	
	public void allAvg() {
		// 국어, 영어, 수학, 전체평균
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		// count
		
		for(int i = 0 ; i < count ; i++) {
			avgKor += students[i].kor; 
			avgEng += students[i].eng; 
			avgMat += students[i].mat; 
		}
		avgKor /= (double)count;
		avgEng /= (double)count;
		avgMat /= (double)count;
		
		avgAll = (avgKor + avgEng + avgMat) / 3; 
		
		System.out.println(count + "명의 학생 평균");
		System.out.println("국어 평균 " + avgKor);
		System.out.println("영어 평균 " + avgEng);
		System.out.println("수학 평균 " + avgMat);
		System.out.println("전체 평균" + avgAll);
		
	}
	
	public void rank() {
		
		for(int i = 0 ; i < count - 1; i++ ) {
			int idx = i;
			for(int j = 1 + i ; j < count ; j++) {
				if(sortedStudents[idx].total() < sortedStudents[j].total()) {
					idx = j;
				}
			}
			Student tmp = sortedStudents[i];
			sortedStudents[i] = sortedStudents[idx];
			sortedStudents[idx] = tmp;
		}		
	}
	
	// 1. 중복학번 학생 등록 방지(학번을 기준으로 학생의 존재 여부)
	
	// 2. 점수당 평균값 출력 + @ 총평균
	
	// 3. 석차 순 정렬
	
	// 4. Student 클래스의 toString 재정의 
	
	public static void main(String[] args) {
		int[] arr = {5,3,2,1,4, 10, 0, 10, 5, 4};
		
		// 탐색 n 최소값
		// 1, 3, 2, 5, 4 > 1회차 결과
		// 1, 2, 3, 5, 4 > 2회차 결과
		// 1, 2, 3, 5, 4 > 3회차 결과
		// 1, 2, 3, 4, 5 > 4회차 결과      회차계수 n-1
		for(int i = 0 ; i < arr.length - 1; i++ ) {
			int idx = i;
			for(int j = 1 + i ; j < arr.length ; j++) {      //비교대상
				if(arr[idx] < arr[j]) {
					idx = j;
				}
			}
			int tmp = arr[i];//최소값 찾아서 두 자리의 idx를 바꾼
			arr[i] = arr[idx];
			arr[idx] = tmp;
	
			System.out.println(i + 1 + "회차 :: " + Arrays.toString(arr));
		}		
	}
	
}