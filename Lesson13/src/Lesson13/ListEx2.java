package Lesson13;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {
public static void main(String[] args) {
	List<String>list=new Vector()<String>();
	list.add("홍길동");
	list.add("새똥이");
	list.add("길똥");
	
	
	list.remove(0);//0번 인덱스에있는애 삭제해
	list.add("말똥");//말똥이추가해
	list.remove("길똥");//길똥이삭제해
	list.set(0, "소똥이");//0번인덱스에 소똥이위치바꿔
	list.add(0,"새똥이");//0번인덱스에 새똥이 추가해 앞으로보내는방법
	
	for(String s:list) {
		System.out.println(s);
	}
	
	System.out.println(list);
	System.out.println(list.size());
}
}
