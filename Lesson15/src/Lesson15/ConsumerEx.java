package Lesson15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsumerEx {
public static void main(String[] args) {
	List<Integer>list=List.of(5,4,3,2,1);
	
	
	list.forEach (t->System.out.println(t)); //이게정답 람다식임
	
//	Consumer<Integer> con =new Consumer<Integer>() {// 뒤에 삭제
//		
//		@Override
//		public void accept(Integer t) { //메서드이름은 다삭제 그리고 식으로 만들어버리면됨
//			// TODO Auto-generated method stub
//		       System.out.println(t);	
//		}
//	}; 
//            list.forEach(con);
	
	Map<String,Integer> map= new HashMap<String, Integer>( Map.of("A",10,"B",20));
	System.out.println(map.getClass().getName());

	map.forEach((k,v)->{
	System.out.println( k + "::" + v );
	
	 });
	
	DoubleConsumer dc = d -> System.out.println(Math.round(d));
  	dc.accept(10.5);
  	
  	ObjDoubleConsumer<String> odc = (s,d)->{};
  	
  	Supplier<String> supplier =()->"12345";
  	System.out.println(supplier.get());
  	
  	
  	//1~100 List
  List<Integer>list2=IntStream./*여기가중간연산*/rangeClosed(1,100).filter(i->i%2==0).boxed()./*여기가 최종연산*/collect(Collectors.toList());
  	System.out.println(list2);
  	
  	BiFunction<String, Integer, Boolean> bf =(s,i)-> s.equals(i+"");
  	BiPredicate<String, Integer> bp =(s,i) -> s.equals(i+"");//애는 앞에 타입이없으니 2개써준거고
  	DoublePredicate dp = d-> d==0;//애는 앞에 double타입이 정해져있으니 제네럴 안써도 됨
  	
  	UnaryOperator<Integer> uo = i->i;
  	
  	
  	
  	
	
        }
}