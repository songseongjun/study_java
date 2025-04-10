package lesson05;

import java.util.Scanner;

public class Ex250409과제1 {
	public static void main(String[] args) {
		// 책문제1번

		
		  int colorPen = 5*12/27; int studentCount =27; int divColorPen =colorPen;
		  System.out.println("학생당 나눠가지는 색연필수:"+divColorPen); int remainColorPen =60%27;
		  System.out.println("똑같이 나눠가지고 남은 볼펜수:"+remainColorPen);
		 

		// 책문제2번
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를입력하세요(6세이상):");
		int age = scanner.nextInt();

		System.out.println("키를입력하세요(120cm이상):");
		int height = scanner.nextInt();

		System.out.println("심장질환여부를 판단하세요 (true,flase):");
		boolean hearchDease = scanner.nextBoolean();

		System.out.println("보호자동반여부를확인하세요 (true,flase):");
		boolean parent = scanner.nextBoolean();

		if (hearchDease) {
			System.out.println("심장질환자는 탑승하실수없습니다");
		} else if (age >= 6 && height >= 120) {
			if (parent) {
				System.out.println("보호자동반하에탑승할수있습니다:");
			} else {
				System.out.println("키가120cm이상은탑승할수있습니다:");
			}

			System.out.println("탑승할수없습니다. 나이 키 조건에맞지않습니다");

		}

		// 1.로그인인증
		// 사용자로 부터 아이디와 비밀번호를 입력 받고
		// 그 아이디가 admin,비밀번호가 1234일때 로그인 성공
		// 아이디가 admin 비밀번호가틀렸을때 로그인 실패>잘못된 비밀번호
		// 아이디가 admin이 아니면 없는 계정메세지 출력
		String id ="";
		String pw ="";
		System.out.print("아이디 비밀번호를 입력하세요>");
		id = scanner.nextLine();
		System.out.println("입력한아이디:"+id);
		
		System.out.print("비밀번호를 입력하세요>");
		pw = scanner.nextLine();
		System.out.println("입력한비밀번호:"+ pw);
         // equals()
		if(id.equals("admin")) {//없는계정
			System.out.println("존재하지않는계정");
		}//있는계정
		else if(pw.equals("1234")) {
			System.out.println("로그인성공");
		}
		else {
			System.out.println("비밀번호틀림");
		}
		// 2.숫자 하나를 입력받아서
		// 3의 배수 그리고 짝수 여부를 동시판별
		// 3의배수,짝수,3의배수이면서짝수,둘다아닌경우
		// scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();

		boolean ase = (num % 3 == 0);
		boolean base = (num % 2 == 0);

		if (ase && base) {
			System.out.println(num + "은3의 배수이면서 짝수야.");
		} else if (ase) {
			System.out.println(num + "은 3의 배수야.");
		} else if (base) {
			System.out.println(num + "은 짝수야.");
		} else {
			System.out.println(num + "은3의 배수도 아니고 짝수도 아니야.");
		} // 이문제 팁은 교집합이라고생각하면쉬움 교집합에들어가는것들을 else if로 다만들어줘서
	      // 생각해주고 그나머지 합집합들을 else로 빼둬서 if, elseif에 적합한 숫자들이 내려오고
		  // 아니면 else로 빠지게되는결과
		
		// 비트 마스크 플래그 예시)
		result = 0;
		result = += 삼의배수 ? 1:0;
		result = += 짝수 ? 2:0;
		String str ="";
		switch(result) {
		case 1:
			str +="3의배수";
		case 2:
			str +="짝수";
		case 3:
			str +="3의배수 짝수";
		}

		// 3.월(month)을 입력받아서 계절을 출력
		// 예시 3~5월은 봄

//      Scanner scanner = new Scanner(System.in);

		System.out.print("월을 입력하세요 (1~12): ");
		int month = scanner.nextInt();

		if (month >= 3 && month <= 5) {
			System.out.println(month + "월은 봄이야.");
		} else if (month >= 6 && month <= 8) {
			System.out.println(month + "월은 여름이야.");
		} else if (month >= 9 && month <= 11) {
			System.out.println(month + "월은 가을이야.");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "월은 겨울이야.");
		} else {
			System.out.println("잘못된 입력이야. 1부터 12 사이의 숫자를 입력해줘.");
		}

	}
}
