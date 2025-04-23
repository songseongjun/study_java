package Lesson13;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Distinct {
public static void main(String[] args) {
	List<Integer> list =new ArrayList<>();//애가 기본생성자
	list.add(3);
	list.add(2);
	list.add(1);
	list.add(2);
	list.add(1);
	list.add(1);
	System.out.println(list);
	list=new ArrayList<> (new LinkedHashSet<>(list));
	//ArrayList<>이생성자에 LinkedHashSet<>생성자를집어넣은것
	System.out.println(list);
}
}
