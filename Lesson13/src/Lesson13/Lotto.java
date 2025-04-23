package Lesson13;

import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		Set<Integer> set =new TreeSet<Integer>();//TreeSet은 중복불가 검색순서정렬
		while(set.size()<6) {
			set.add((int)(Math.random()*45+1));
			
		}
		System.out.println(set);
	}
	
	
	
}
