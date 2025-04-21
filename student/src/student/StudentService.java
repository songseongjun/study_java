package student;

import java.util.Arrays;
//1.모든필드 ,메서드 ,생성자 >>접근제한자 만들기 public같은것들붙이기  필드는private 메서드는public    o
//2. 어떤 값을 입력하더라더 예외처리(프로그램 종류는 정상종료)   O
//3. 점수값 입력을 범위 0~100사이만 인정   Ex)예외로핤ㅜ도있고 조건문으로 할수도있다
//4. 이름 입력은 한글만 인정, 2글자~4글자사이  Ex)예외로핤ㅜ도있고 조건문으로 할수도있다 O
//5. 임시데이터(개동이,말동이 소동이가 임시데이터) 의 값을 랜덤으로 배정(60~100)  O
public class StudentService {
	private Student[] students = new Student[4];
	private Student[] sortedStudents = new Student[students.length];
	private int count;
		{
		    students[count++] = new Student(1,"개똥이",randScore(),randScore(),randScore());
		    students[count++] = new Student(2,"새똥이",randScore(),randScore(),randScore());
		    students[count++] = new Student(3,"말똥이",randScore(),randScore(),randScore());
		    students[count++] = new Student(4,"소똥이",randScore(),randScore(),randScore());

		    sortedStudents = students.clone();
		    rank();
		}
		 private int randScore() {
		    return (int)(Math.random()*41) + 60;
 }

	// 입력 : 학번
	// 출력 : 학생
		 Student findBy(int no) {
				Student student = null;
				for(int i = 0; i < count ; i++) {
					if(students[i].getNo() == no) {
						student =students[i];
						break;
					}
				}
				return student;
			}
   //	이름 입력은 한글만 인정.하는부분
//	String inputValidName() {
//	    while(true) {
//	        String name = StudentUtils.nextLine("이름");
//	        if(name.matches("[가-힣][2,4]")) {
//	        	name=[i];
//	        }
//	        System.out.println([i]);
//	    }
//	}
	
	public int checkRange(String subject,int input, int start ,int end) {
		if(input<start|| input>end) {
		throw new IllegalArgumentException(subject +"값의 범위가 벗어났습니다" + start + "~" + end + "사이의 입력을해주세여");
		}
		return input;
	}
	public int checkRange(String subject,int input) {
	return checkRange(subject,input,0,100);
	}
	
	
	public String checkName(String name) {
		String Name = StudentUtils.nextLine("이름 >");
		if(name.length()<2|| name.length()>4){
			throw new IllegalAccessException("이름은 2~4글자로 입력하세요");
		}
		for(int i =0; i<name.length();i++) {
			if(name.charAt(i)<'가' || name.charAt(i)>'힣') {
				throw new IllegalAccessException("이름은 한글로만 입력하세요");
			}
		}
		return name;
	}
	
	// 등록
	
	public void register() {
		
		System.out.println("등록 기능");
		//학생 정보 등록 후 출력
		
		//풀이
		int no = StudentUtils.nexInt("학번 : " );
		Student s = findBy(no);
		
		if(s != null) {
			System.out.println("중복된 학번이 존재합니다. ");
		}

			return;
		}
//		for(int i = 0 ; i < count ; i++) {
//			if(no == students[i].no) {
//				System.out.println("중복된 학번입니다.");
//				return ;	//초기메뉴로 돌아간다
//			}
//		}
		String name = StudentUtils.nextLine("이름 > " );
		
		int kor = StudentUtils.nexInt("국어 > " );
		checkRange("국어", kor);
	
	 	
		int eng = StudentUtils.nexInt("영어 > " );
		checkRange("영어", eng);
		
		int mat = StudentUtils.nexInt("수학 > " );
		checkRange("수학", mat);
		
		if(count == students.length) {
			students = Arrays.copyOf(students, students.length * 2);
		}
		
		students[count++] = new Student(no, name, kor, eng, mat);
		//students[0]에 학생의 정보 입력
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();	//복제하고 정렬해라
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
		
		
		
		String name =StudentUtils.nextLine("이름 > ");
		s.setName(name);
		s.setKor (checkRange("국어",StudentUtils.nexInt("국어 > ")));
		s.setEng (StudentUtils.nexInt("영어 > "));
		s.setMat (StudentUtils.nexInt("수학 > "));
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
			if(students[i].getNo() == no) {
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
			avgKor += students[i].getKor(); 
			avgEng += students[i].getEng(); 
			avgMat += students[i].getMat(); 
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

