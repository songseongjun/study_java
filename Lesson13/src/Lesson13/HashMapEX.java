package Lesson13;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HashMapEX {
public static void main(String[] args) {
	Map<String, Integer> map =new HashMap<String, Integer>();
	map.put("A", 10);
	Integer j=map.put("B", 70);
	int i =map.put("B", 50);
	map.put("c", 50);
	System.out.println(map);
//	System.out.println(i);
//	System.out.println(j);
	
	Set<String>keys=map.keySet();
	System.out.println(keys);
	
List<Integer> v1= new ArrayList<Integer>(map.values());
Set<Integer> v2= new HashSet<Integer>(map.values());

System.out.println(v1);
System.out.println(v2);//중복된값이B 70이빠짐

  Set< java.util.Map.Entry<String,Integer>> s = map.entrySet();
      	for(java.util.Map.Entry<String,Integer> e : s ) {
     		System.out.println(e.getKey()+" : " + e.getValue());
      	}

//      	Properties properties =new Properties();//이친구는속성을물어보는것
      	
}
}
