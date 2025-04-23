package Lesson13;

import java.util.Iterator;
import java.util.Set;

public class IterEx {
public static void main(String[] args) {
	Set<Integer> set =Set.of(10,20,30,40,50);
	System.out.println(set);
	
	
	
	Iterator<Integer>it=set.iterator();//다음
//	System.out.println(it.next());//앞에있는친구가 출력됨
//	System.out.println(it.next());//두번째있는친구 출력됨
//	System.out.println(it.next());//세번째
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("===========================");
	for(Integer i : set) {
		System.out.println(i);
	}
}
}
