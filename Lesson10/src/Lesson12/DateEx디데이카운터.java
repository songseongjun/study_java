package Lesson12;

import java.time.Duration;
import java.util.Date;

public class DateEx디데이카운터 {
public static void main(String[] args) {
	// 오늘날짜
	// 1970 .1 .1 을 바꾸면 >>70,0,1
	Date today =new Date(125,3,21);//  <<하나올려서 123 3이라나옴
	
	//수료날짜
	Date endDate =new Date(125,8,29); // << 하나 깍아서 8월이된거
	
	
	long duration = endDate.getTime() - today.getTime();
	System.out.println(duration/1000/60/60/26);
}
}