package Lesson13;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
public static void main(String[] args) {
	List<Integer> list =new ArrayList<Integer>();//맨앞에 있는 List인터페이스 list임 그리고 크기지정을안함!
	                                  //< >여기안에 타입을넣어줘야함 그래서 Integer넣어줌
	list.add(1);//add를호출함 추가 할땐 add
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add((int)'A');//size는7이다 add7번호출해서
	
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));//get을통해서 몇번째 인덱스를가져와라한거임
		                                 //뺄때는 get을사용
	}
	System.out.println(list.toString());//이렇게 쓰면 바로 안에있는배열보여줌
}
}
