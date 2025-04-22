package Lesoon12_1;
import java.util.Calendar;
import static java.util.Calendar.*;

import java.text.SimpleDateFormat;
public class MyCalendar달력만들기 {
public static void main(String[] args) {
	// 숫자 <> 문자열(숫자와 문자열 상화작용)
	//숫자>> 문자열  :format한다 함
	//문자열>> 숫자   :parse 한다 함
	
	// 날짜 <> 문자열
	// 날짜 >> 문자열  :format이라함
	// 문자열 >> 날짜  :parse 이라함  문자열을 실제 데이터로 만들어주는게parse임
     // double d =1e3; 이게 100임 e3이 공000들어갔다는거 -붙으면 100분에1임	
	
	Calendar cal =getInstance();
	cal.set(DATE, 1);
	cal.add(MONTH, -1);//6월달력만드는것
	int lasDate =cal.getActualMaximum(DATE);
	int startDay=cal.get(DAY_OF_WEEK);
	System.out.println(startDay-1);//애가 저밑에 밀려났던 핵심원인
	                                //Startday는 달에시작요일!
	int d= startDay -1;//그래서 애를 변수로 만들어서 -1빼줌
	System.out.println(new SimpleDateFormat("yyyy/MM 달력").format(cal.getTime()));
	for (int i = 1-d; i <= lasDate; i++) {    //i를 -1로만들고밀려나게
		if(i<1) {
			System.out.printf("%3c",' ');
		}
		else {
			System.out.printf("%3d",i);
		}
//		System.out.printf("%3d",i);//3칸 간격으로 출력될숫자가 가로로보여지는것

	    if(i % 7 == ((7-d)%7)) {            // 2칸밀려나서 7-2로되서 5
	    	System.out.println();
	    }
	
     	}	
    }
 }
