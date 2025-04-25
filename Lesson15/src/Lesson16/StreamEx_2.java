package Lesson16;

import java.io.InputStream;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx_2 {
	public static void main(String[] args) {
		
		
		
		//1. 스트림 생성 방법
		//of(), builder(), generate () ,배열로부터,컬렉션으로부터
		
		
		//2. 스트림의종류
		//Stream<T> , InStream ,Double STream , LongStream
		
		
		
		//3.스트림의연산
		//최종연산
		//forEach()  요소전체를 반복하는 메서드이기도함!최종단계반복
		//중간 연산
		// filter()  , distinct() , map() , flatMap(),boxed() sorted()
		
            //숫자역순하고싶으면 sorted(Comparator.reverseOrder())람다식으로 줄인거임이게 
	List<Integer>list =IntStream.rangeClosed(1,10).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(list);
	//최종연산자가 없으면 처리안함 잘기억해 peek는 요소전체를 반복하는 메서드메서드 중간 처리반복자
List<Integer> list2=new Random().ints(10,0,10).boxed().peek(System.out::println).collect(Collectors.toList());
System.out.println(list2);

boolean result =Stream.of(1,3,4,5).allMatch(i->i%2==1);
System.out.println(result);
	
result =Stream.of(1,3,4,5).anyMatch(i->i%2==1);
System.out.println(result);



	
	}
}
