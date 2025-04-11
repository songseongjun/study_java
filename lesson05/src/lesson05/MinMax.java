package lesson05;

public class MinMax {
public static void main(String[] args) {
//	int[]arr= {10,1,3,5,6};
//	//최대값 최솟값
//    int max = arr[0];
//    int min = arr[0];
//    for (int i = 1; i < arr.length; i++) {
//		if(max<arr[i]) {
//			max =arr[i];
//		}
//		else if(min>arr[i]){
//			min=arr[i];
//		}
//	}
//	System.out.println("최댓값:"+max);
//	System.out.println("최솟값:"+min);
//	//  합계 평균
//	int sum =0 ;
//	for(int i=0; i<arr.length; i++) {
//		sum +=arr[i];
//	}
//           System.out.println("합계:"+sum);
//           System.out.println("평균:"+sum /arr.length);
	
	// 3 6 9게임
	for (int i = 1; i < 50; i++) {
		int count=0;//박수를칠횟수
		int tmp= i;
		// 박수 횟수반복
		do {
			if(tmp%10%3==0 && tmp%10 !=0) {
				count++;
			}
	}
		while((tmp/=10)!=0);
		if(i%3==0)count++;
		if(count>0) {
			System.out.println("짝");
			for(int j=0; j<count;j++) {
				System.out.print("짝");
			}
			System.out.println();
		}
		else {
			System.out.println(i);
		}
}
}
}