package Lesson13;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
public static void main(String[] args) {
	Set<String> set=new TreeSet<String>();
	set.add("새똥이");
	set.add("말똥이");
	set.add("개똥이");
	set.add("1");
	set.add("2");
	set.add("9");
	set.add("10");
	
	System.out.println(set);
	
	Set<Integer> set2 =new TreeSet<Integer>();//타입에있어서 정렬위치는 따라간다
	set2.add(1);                              //정렬은 비교인터페이스다
	set2.add(2);
	set2.add(9);
	set2.add(10);
	System.out.println(set2);
	Set<Addr> set3=new TreeSet<>();
	set3.add(new Addr("개똥이","1234"));
	set3.add(new Addr("새똥이","5678"));
	System.out.println(set3);
}
}
