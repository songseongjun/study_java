package lesson06_2;

import java.util.Arrays;

public class EX배열 {
public static void main(String[] args) {
	
	int i=10;
	//배열 (array)
	int[]arr = new int[] {10,20,30,50}; //
	System.out.println(i);
	//배열에 접근 >>index
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	// OS
	arr[0]=60;//60, 20,30,50
	arr[1]=arr[2];
	arr[3]= i;//{60,30,30,10}
	//
	int[ ]arr1= {1,2,3};//값
	int [ ]arr2=new int[3];//길이를 통한 초기화
     //{0,0,0}
	
	int []arr3 =new int [] {5,6,7,8};
	System.out.println(arr1);
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr3));
//	arr1= {10,40,50}(이건안됨)  arr1 =new int[] {10,40,50}; arr1 =new int [10];(이것들은된다)
	String[]arr4=new String[3];
	System.out.println(Arrays.toString(arr4));
	
	char ch ='가';
	ch=44032;
	ch='\uAC00';
	ch=0xac00;
	
	// 'A'>> 65
	// 'a'>> 97
	// '0'>> 48
	
}
}
