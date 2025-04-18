package Lesson12;

public class MemberMain {
public static void main(String[] args) {
	Member member = new Member("새똥이","02-1234-5678");
	Member member2 = new Member("개똥이","02-1234-5678");
	System.out.println(member.equals(member2));
	System.out.println(member==member2);       //두개의 말은 똑같다
	System.out.println(member.toString());   
	//문자열에서 tostring은 호출하지않아도 자동으로 호출된다
	
	Member m =(Member)member.clone();
	System.out.println(m);
}
}

