package Lesson13;
import java.util.HashSet;
import java.util.Set;
public class HasheSetEx {
public static void main(String[] args) {
	//  <  >여기에들어가는게 제네릭 즉 자료구조에서들어가는타입
	
	Set<Addr> set = new HashSet<>();
	set.add(new Addr("새똥이","1234"));
	System.out.println(set);
	Addr addr =new Addr("개똥이","5678");
	set.add(addr);
	System.out.println(set);
	set.add(addr);//addr은주소가 들어가있는변수 참조자료형
	
	
	//equals(),haschcode()
	Addr addr2=new Addr("말똥이","1234");
	set.add(addr2);
	System.out.println(set);
	for(Addr a: set) {
		System.out.println(a.hashCode());
	}
	System.out.println(addr2.hashCode());
}
}
class Addr implements Comparable<Addr>{

	String name;
	String tel;
	public Addr(String name, String tel) { 
		super();
		this.name = name; //Alt누르고 s누르면 sorce소스로감 거기에 앞에글자들단축기들누르면 거기에맞는코드나옴
		this.tel = tel;
	}
	@Override
	public String toString() {
		return String.format("Addr [name=%s, tel=%s]", name, tel);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return tel.hashCode();
	}
	@Override             //오버라이딩하는방법은 Alt s누르고 v하고 tap2번 스페이스바가 선택임
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return tel.equals(((Addr)obj).tel);//텔과텔을 비교함 문자열 서로 비교하는건 이퀄스 저이퀄스는 스트링에서온이퀄스이다
	}
	@Override
	public int compareTo(Addr o) {
		// TODO Auto-generated method stub
		return -name.compareTo(o.name);
	}
	
	
}