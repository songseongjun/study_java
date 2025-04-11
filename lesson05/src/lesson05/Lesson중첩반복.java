package lesson05;

import java.util.Arrays;

public class Lesson중첩반복 {
public static void main(String[] args) {
	int[ ]lotto=new int[6];
	int idx=0;
	while(true){
		int number =(int)(Math.random()*45)+1;
		boolean insert/*(insert 중복체크역할)*/ =true ;
		for (int i=0; i<=idx; i++) {
			if(lotto[i]==number) {
				insert=false;
				break;
			}
		}
		if(insert==true) {
			lotto[idx]=number;
			idx++;
		}
		if(idx==6)break;
	}
	 int[]arr= lotto;
	 for(int i=0;i<arr.length-1;i++) {
		 System.out.println(i+1+"회차");
		 for(int j=0; j<arr.length-1-i; j++) {
			 if (arr[j]>arr[j+1]) {
				 int tmp =arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=tmp;
			 }
			 System.out.println(Arrays.toString(arr));
		 }
	 }

}
}
