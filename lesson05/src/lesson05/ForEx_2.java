package lesson05;

import java.util.Scanner;

public class ForEx_2 {
	public static void main(String[] args) {
		
	
//	int sum = 0;
//	for(int i=1; i <= 100; i++){
//		sum += i;
//		System.out.printf("i:%3d,sum:%4d\n",i,sum);//이렇게 쓰면 증강의 형태를 볼수있다.
//	}
//System.out.println(sum);

//      int sum =0;
//      for(int i=0; i<=100; i++) {
//    	  if(i%3==0)
//	  System.out.println("i ="+i);
//}
 // 숫자를 입력받고 해당숫자의 약수(입력받은숫자를 나눴을때 나머지가없는 수)들을 출력
      //12
      // 1 2 3 4 6 12
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를입력하세요");
		int input = scanner.nextInt();
		int i=1;
	   while( i<=input) {
    	  if(input%i==0);
    	  System.out.println(i);
      }
	   i++;

}
}