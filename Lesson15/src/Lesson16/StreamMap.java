package Lesson16;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMap {
public static void main(String[] args) {
	//학생타입의 List
	//List<Student> >> Stream<Student>
	
	
	List<Student>students =List.of(new Student("새똥이",100),new Student("개똥이", 70),new Student("말똥이", 80));
	Stream<Student> stream = students.stream();//저위에껄스트림으로 바꾼것
//  Stream<Integer>stream3 = stream.map(s->s.score);//저위에있는걸 스트림 람다식으로 해서 바꾼거
  //map써서하는건 인티저 타입 봐서 맞춰주고 뒤에는 람다식 students를s로둠그러면 s->s한테 값을 받는다 그러고 score점수달라하면끝
  IntStream stream2 = stream.mapToInt(s->s.score);
//	stream2.forEach(System.out::println);
	
	int sum =stream2.sum();
	System.out.println(sum);
	
}
}
class Student {
	String name;
	int score;
	public Student(String name,int score) {
		this.name=name;
		this.score=score;
	}
	@Override
	public String toString() {
		return String.format("StreamMap [name=%s, score=%s]", name, score);
	}
	
}
