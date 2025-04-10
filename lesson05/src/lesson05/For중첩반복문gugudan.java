package lesson05;

public class For중첩반복문gugudan {
	public static void main(String[] args) {
		for(int i =2; i <= 4; i++){
		for(int j =1;/*(순서1번째초기화식)*/j<= 2;/*(2번째조건식)*/j++/*(3번째증감식)*/) {
		 
			System.out.printf("%d * %d = %d\n", i, j ,i*j)/*(4번째실행문)*/;
		}
		
	}
  }
}
