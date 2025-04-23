package Lesson13;

import java.util.Set;
import java.util.TreeSet;

public class SortEx {
public static void main(String[] args) {
	 String str1="AAA";//65
	 String str2="AA"; //66//문자열로 비교한다 AA는겹치니까 뒤에 AC를비교 안겹치면 앞에꺼만 비교한다
	 
	 System.out.println(str1.compareTo(str2));
	 Integer i= 10; 

	 
	 System.out.println(Integer.compare(10, 20));
	
	 
	 Set<Data> set =new TreeSet<Data>();
	 set.add(new Data(5,"A"));
	 set.add(new Data(3,"A"));
	 set.add(new Data(1,"A"));
	 set.add(new Data(2,"A"));
	 set.add(new Data(4,"A"));
}
}

class Data implements Comparable<Data>{
	int i;
	String name;
	public Data (int i ,String name) {
		this.i= i;
		this.name =name;
		// TODO Auto-generated method stub
		
		//return -(i-o.i)
//		return -Integer.compare(i,o.i);
		//i값을 기준으로 오름차순
		//i값이 서로 같을시 name값 내림차순
	
	}
	@Override
	public int compareTo(Data o) {
		// TODO Auto-generated method stub
		int ret = 0;
		ret = this.i -o.i;
		if(ret==0) {
			return name.compareTo(o.name);
		}
		
		
		System.out.println(ret);
		return ret;
//		return this.i-o.i;
		
	}
	@Override
	public String toString() {
		return String.format("Data [i=%s, name=%s]", i, name);
	}
	
}