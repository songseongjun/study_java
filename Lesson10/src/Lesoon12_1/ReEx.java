package Lesoon12_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
public static void main(String[] args) {
	String regex ="\\d";//역슬래시가 두번들어가야 숫자
	regex ="[0-9]";//숫자
	regex ="\\D";//숫자아님
	regex ="[^0-9]";//숫자아님
	
	Pattern p = Pattern.compile("b[a-z]*");//compile 안에 주소가들어가야하는데 여긴 잘못들어감
    //"b[A-Za-z]+"이렇게 되면 b뒤에 영대문자와 영소문자가 와야한다//Pattern은compile(여기안에소문자 b는 무조건들어가고[  ]안에 소문자가들어가고0개는무저건있어야함그래서*이들어감
	Matcher m;
	String[] strs= {"bat","cat","bed","bAt","Bat","b"};
	
	

	
	for(String s : strs) {
		m= p.matcher(s);
		System.out.println(s+"="+m.matches());
	}
	//이메일주소패턴
		//휴대전화 패턴
		String tel ="01[0-9]-[0-9]{3,4}-[0-9]{4}";
		String p1 ="010-1010-1111";
		System.out.println(p1.matches(tel));
		
		System.out.println("abcd1234abcd".replace("a","e"));//a를 e로바꾼다는 것!
		System.out.println("abcd1234abcd".replace("a","e"));// 
}
}
