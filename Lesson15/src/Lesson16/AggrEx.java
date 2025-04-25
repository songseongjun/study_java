package Lesson16;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AggrEx {
public static void main(String[] args) {
	 //갯수 합계 평균  최대 최소
	List<Student> list = List.of(new Student("새똥이",100),new Student("개똥이", 90),new Student("새똥이", 80));
	
	// 80점 이상의 학생의 인원수 구하기
long count=list.stream().filter(s->s.score>=80).count();
System.out.println(count);
	System.out.println(count);
	//기본자료형 상태로 만들어준거임 stream에서 원래 sum을못써서 이렇게 기본으로바꿔준거map써서
long sum =list.stream().mapToInt(s->s.score).sum();	
System.out.println(sum);
	 
//평균구하기 방법  stream은 한번쓰면사라짐
OptionalDouble od = list.stream().mapToInt(s->s.score).average();
System.out.println(od.getAsDouble());

//이름의최댓값구하기 max이용한거

   Optional<Student> optional =list.stream().max((s1,s2)-> s1.name.compareTo(s2.name));
   System.out.println(optional);
   
   //최솟값구하기임이게  min이용한거
  long min=list.stream().mapToLong(s -> s.score).min().getAsLong();
  System.out.println(min);
   
   
  "abcd".concat("1234");
   
   


}
}
