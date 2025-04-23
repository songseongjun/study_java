package Lesson13;

import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
public static void main(String[] args) {
	Properties props=System.getProperties();
	Set<Object> keys =  props.keySet();
	for(Object o: keys) {
		System.out.println(o+" :: "+System.getProperty(o.toString()));
	
	
	}
	
	Object o=10;
	Object o2="산소";
	Object o3=props;
	System.out.print(o,o2,o3);
	
	
//	Properties properties =new Properties();//이친구는속성을물어보는것
}
}
