package Lesoon12_1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Calendar.*;//이게붙으면 Calendar를 생략할수있다
import static java.util.Scanner.*;// 이건 Scanner 생략

import java.text.SimpleDateFormat;

public class CalendarEx {
public static void main(String[] args) {
	Calendar cal1=getInstance();
	Calendar cal2 =new GregorianCalendar();
//	System.out.println(cal1);
	Scanner scanner = new Scanner(in);	
//	cal1.set(0, 0);
	
System.out.println(cal1.get(ERA));
System.out.println(cal1.get(YEAR));// 연도
System.out.println(cal1.get(MONTH));// 달(1월은 0부터시작)
System.out.println(cal1.get(DATE));// 오늘일자와시간
System.out.println(cal1.get(HOUR));// 시간
System.out.println(cal1.get(MINUTE));// 분
System.out.println(cal1.get(SECOND));// 초 
System.out.println(cal1.get(DAY_OF_MONTH));//현재 월에서 몇번째요일인지
System.out.println(cal1.getActualMaximum(DATE));


cal1.roll(MONTH, -10);  //.roll 월올림차순으로 월을 했을때
                         //.add 다음달 다음해을 기대한다 했을때
printCal(cal1);
}

static void printCal(Calendar cal) {
	System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));

}
}
