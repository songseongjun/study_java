package Lesson16;

import java.util.Optional;

public class OptionalEx {
public static void main(String[] args) {
	Optional<Integer> optional=Optional.ofNullable(10);//기본값저10위치에값이 nulld일때 저20으로대체한다는것
	
	if(optional.isPresent()) {
		System.out.println(optional.get());
	}
	else {
		System.out.println(50);
	}//이걸 줄인게 저밑에 엘스 20임!!
	
	System.out.println(optional.orElse(20));
	
	System.out.println(optional.orElseGet(()->30));
	
	
	System.out.println(optional.isPresent());//아이템박스있고 널일때도 추가할수있는게 저optional
	System.out.println(optional.isEmpty());
	
	optional.ifPresent(System.out::println);
	
	optional.orElseThrow(()->new RuntimeException("값이 없음"));//
	
}
}
