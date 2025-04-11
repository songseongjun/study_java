package lesson05;

public class EXlesson정렬 {
public static void main(String[] args) {
	//정렬
	// 버블 정렬
	//{3,4,1,5,2}
	//{3,1,4,5,2}
	//{3,1,4,2,5}(위치바뀐게 1,4중에 4가더크니 이동, 5와2중 5가더크니 이동)
	//2회차
	// {1,3,4,2,5}
	// {1,3,4,2,5}
	// {1,3,2,4,5}
	//3회차
	// {1,2,3,4,5}
	//4회차
	//확정
	 int[]arr= {3,4,1,5,2};
	 for(int i=0;i<arr.length-1;i++) {
		 System.out.println(i+1+"회차");
		 for(int j=0; j<arr.length-1-i; i++) {
			 if (arr[j]>arr[j+1]) {
				 int tmp =arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=tmp;
			 }
			 System.out.println(arr);
		 }
	 }
}
}
