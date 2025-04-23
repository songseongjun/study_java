package lesson14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex250423 {
public static void main(String[] args) {
	//Map을사용한 문자의 빈도 계산
	//{a:5,b:4,c:3,d:5}출력결과가 이렇게 나오게 해야함
	String str ="aaaaabbbbccccddddd";
	Map<String, Integer> map =new HashMap<String, Integer>();
      
	Integer a =map.put("a", 5);
      Integer b =map.put("b", 4);
      Integer c =map.put("c", 4);
      Integer d =map.put("d", 5);
	Set<String>keys=map.keySet();
	 Set< java.util.Map.Entry<String,Integer>> s = map.entrySet();
   	for(java.util.Map.Entry<String,Integer> e : s ) {
  		System.out.println(e.getKey()+" : " + e.getValue());
   	}
}
}
