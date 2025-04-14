package lesson06_2;

public class ArrEx10 {
public static void main(String[] args) {
	int[][]arr= {{1,2,3},{4,5,6},{7,8,9,}};
	System.out.println(arr[1][0]);
	
	String[][][] strs = {
			{},{ {"A","B","C"},{"가","나","다"}},{{ "0","1" } }		
	};
	// strs.length
	//1차원배열{}
	//2차원배열 { {"A","B","C"},{"가","나","다"}}
	//3차원배열 {{ "0","1" } }		
	System.out.println(strs.length);
	System.out.println(strs[1].length);
	System.out.println(strs[1][1].length);
	System.out.println(strs[1][1][1]);
}
}
