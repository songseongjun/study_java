package student;

import java.util.Arrays;

public class StudentService {
	Student[] students = new Student[2];
	int count;
	{

		students[count++] = new Student(1, "개똥이", 60, 80, 90);
		students[count++] = new Student(1, "냄똥이", 20, 20, 20);

	}

	// 등록
	void register() {
		System.out.println("등록 가능");
		int no = StudentUtils.nexInt("학번>");
		String name = StudentUtils.nextLine(" 이름> ");
		int kor = StudentUtils.nexInt("국어>");
		int eng = StudentUtils.nexInt("영어>");
		int mat = StudentUtils.nexInt("수학>");
		if (students.length == count) {
			students = Arrays.copyOf(students, students.length * 2);

		}
		students[count++] = new Student(no, name, kor, eng, mat);
		

	}

	// 조회
	void read() {
		System.out.println("조회 가능");
		System.out.println("전체 학생 정보:");
		for (int i = 0; i < count; i++) {

			System.out.println(students[i].no + " , " + students[i].name + " , 총점: " + students[i].total() + " , 평균: "
					+ students[i].average());
		}
	}

	// 수정//학생들 배열에서 입력받은 학번과 일치하는 학생
	void modify() {
		 System.out.println("수정 가능");
	        int no = StudentUtils.nexInt("수정할 학생의 학번> ");
	        Student s =null;
	        for (int i = 0; i < count; i++) {
	            if (students[i].no == no) {
	               s= students[i];
	               break;
	            }
	        }
	        s.name = StudentUtils.nextLine("이름> ");
            s.kor = StudentUtils.nexInt("국어> ");
            s.eng = StudentUtils.nexInt("영어> ");
            s.mat = StudentUtils.nexInt("수학> ");
            System.out.println("학생 정보가 수정되었습니다.");
	        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
	    }
	// 삭제

	void remove() {
		System.out.println("삭제 가능");
		int no = StudentUtils.nexInt("삭제할 학생의 학번> ");
		for (int i = 0; i < count; i++) {
			if (students[i].no == no) {
				System.arraycopy(students, i + 1, students, i, count - 1 - i);
				count--;
				break;
			}

		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int idx = 0;
		System.arraycopy(arr, idx + 1, arr, idx, arr.length - 1 - idx);
		System.out.println(Arrays.toString(arr));
	}
     // 평균값 총평균 조회
	void avg() {
	    int korSum = 0,engSum = 0,matSum = 0;
	    for (int i = 0; i < count; i++) {
	        Student s = students[i];
	    }
	    if (count > 0) {
	        System.out.println("--------과목별 평균--------");
	        System.out.println("국어 평균:"+(korSum/count));
	        System.out.println("영어 평균: "+(engSum/count));
	        System.out.println("수학 평균: "+(matSum/count));
	        int totalSum = korSum+engSum+matSum;
	        double totalavg = totalSum/(count * 3.0);
	        System.out.println("전체 평균:"+totalavg);
	    }
	       
	}
	
	//석차순 조회
	void sbts() {
		for (int i = 0; i <count-1; i++) {
			for (int j = 0; j < count-1-i; j++) {
				if(students[j].total()<students[j+1].total());
				students=temp;
				students[i]=studnet[j]+1;
				students[j+1]=temp;
					}
			}System.out.println("========= 총점 기준 석차 정렬 결과 =========");
			 for (int i = 0; i < count; i++) {
	       Student s = students[i];
		   System.out.println((i + 1) +"등:"+s.name +"(총점:"+s.total()+",평균:"+s.average()+")");
			}
	     }
	

	}

//1.중복 학번 학생 등록 방지
//2. 점수당 평균값 출력+@총평균구하기 (메인메뉴에서 기능바꿔야댐 배열안에 들어간 값에 sum해서평균내야함)
//3.총점석차 순 정렬 점수로매겨서 1등 2등 3등
