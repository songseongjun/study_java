package Lesson13;
import java.util.HashSet;
import java.util.Set;
public class SetEx {
public static void main(String[] args) {
	Set<String> set =new HashSet<>();
	set.add("사과");
	set.add("메론");
	set.add("망고");
	
	Set<String> set2 =new HashSet<>();
	
	set2.add("사과");
	set2.add("포도");
	set2.add("망고");
	
	//set은 집합이라생각하면됨
	System.out.println(set);
	System.out.println(set2);
	System.out.println(set.contains("포도"));
	System.out.println(set.contains("사과"));
	// result set2 교집합
	Set<String>result =new HashSet<>(set);
	result.retainAll(set2);
	System.out.println("교집합");
	System.out.println(result);
	// result set2 합집합
	result = new HashSet<String>(set);
	result.addAll(set2);
	System.out.println("합집합");
	System.out.println(result);
	//차집합
	result.removeAll(set2);
	System.out.println("차집합");
	System.out.println(result);
	
	
}
}
