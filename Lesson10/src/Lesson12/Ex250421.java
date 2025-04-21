package Lesson12;

import java.io.File;
import java.util.Arrays;

public class Ex250421 {
public static void main(String[] args) {
	String url ="https://search.naver.com/search.naver?where=nexearch&sm=top_sug.pre&fbm=0&acr=1&acq=%EA%B3%A0%EC%96%91%EC%9D%B4&qdt=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=sk7kijw8";
	//      프로토콜://search.naver.com여기가 도메인/ search.naver 파일명 ?쿼리스트링
	//1 . 위 항목에 맞춰 문자열 자르기
	
	System.out.println(url.substring(url.indexOf("https"),url.lastIndexOf("ackey=sk7kijw8")));
	//where=nexearch&sm=top_sug.pre&fbm=0&acr=1&acq=%EA%B3%A0%EC%96%91%EC%9D%B4&qdt=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=sk7kijw8
	//쿼리스트링은  키1=값1 & 키2=값2  저위에 것들을 각각 잘라서 보여줘야함
	// 즉 값은 쌍의 &로 구분 ,키와 값은 = 로 구분
	
	
}
}

