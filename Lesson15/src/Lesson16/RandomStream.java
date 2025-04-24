package Lesson16;

import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import javax.xml.crypto.Data;


public class RandomStream {
public static void main(String[] args) {
	Random random =new  Random();
	System.out.println("int형 난수");
	IntStream is =random.ints(3);
//	is.forEach(s->System.out.println(s);원래 이거인데 저밑에걸로 줄인거!
	System.out.println("==========================");
	is =random.ints(10 ,0 , 3);
	is.forEach(System.out :: println);// 인스턴스메서드 참조해서한게 이거
	
	System.out.println("long형 난수");
	random.longs(3,0,10).forEach(System.out::println);
	
	System.out.println("double 형 난수");
	random.doubles(3).forEach(System.out::println);
	
	"ABCD".chars().forEach(i -> System.out.println ((char)i));
	
//	DoubleBinaryOperator dbo =(x,y)  -> Math.max(x, y); 이 위에꺼가 밑에꺼로 줄여짐
//	DoubleBinaryOperator dbo =Math::max;
//	dbo.applyAsDouble(10, 20);
//	BiPredicate<String,String> pre =(s1,s2)  -> s1.equals(s2); 인스턴스 메서드라서 타입만따라줘야함
//	BiPredicate<String,String> pre =String::equals; //매개변수이용해서 한것!
//	
//	
//	
//	Function<String, Integer> fn =Integer::parseInt;//Integer이자리가 파라미터올자리
//	Function<String, Integer> fn = s-> Integer.parseInt(s);//저위에꺼 길게푸게이거
//	
//	Function<String, Integer> fn2= s-> new Data(s);
//	Function<String, Data> fn2= Data::new;
	
	
	
	
	
	
}
}
class Data2{
	String name;
}
