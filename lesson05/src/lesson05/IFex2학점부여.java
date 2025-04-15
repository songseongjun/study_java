package lesson05;

public class IFex2학점부여 {
	public static void main(String[] args) {
		int score/*(변수)*/ = 60;
		String grade ="";
		System.out.println("학점 부여 시작");
		if(score>=95) {
			grade ="A+";
		}
		else if(score>=90) {
			grade ="A";
		}
		else if(score>=85) {
			grade ="B";
		}
		else if(score>=80) {
			grade ="C";
		}
		else if(score>=70) {
			grade ="D";
		}
		else if(score>=60) {
			grade ="F";    }
		else {
				grade ="F";
		}
	System.out.println("당신의학점은"+grade+"입니다.");
	System.out.println("학점부여끝");


}
}