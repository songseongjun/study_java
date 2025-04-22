package Lesson12;
import java.io.File;
import java.util.Arrays;
public class Ex250421 {
public static void main(String[] args) {
	String url ="https://search.naver.com/search.naver?where=nexearch&sm=top_sug.pre&fbm=0&acr=1&acq=%EA%B3%A0%EC%96%91%EC%9D%B4&qdt=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=sk7kijw8";
	MyUrl myurl =new MyUrl(url);
	System.out.println(myurl);
	
	
	//      프로토콜://search.naver.com여기가 도메인/ search.naver 파일명 ?쿼리스트링
	//1 . 위 항목에 맞춰 문자열 자르기
	
//	String protocol = url.substring(0, url.indexOf("://"));
//    String domain = url.substring(url.indexOf("://"),url.indexOf("/",8));
//    String file = url.substring(url.indexOf("/", 8), url.indexOf("?"));
//    String query = url.substring(url.indexOf("?")+1);
//    String[] parts ={protocol,domain,file,query};
//    System.out.println("프로토콜:"+parts[0]+"도메인:"+parts[1]+"파일명:"+parts[2]+"쿼리스링"+parts[3]);
//	String protocol = url.substring(0, url.indexOf("://"));
//	System.out.println(protocol);
//	url=url.substring(url.indexOf("://"))+"://".length();
//	System.out.println(url);
//	 String domain = url.substring(0,url.indexOf("/"));
//	 System.out.println(domain);
//	 url= url.substring(url.indexOf("/")+"/".length());
//	 String file = url.substring(0,url.indexOf("?"));
//	 System.out.println(file);
//	 url= url.substring(url.indexOf("?")+"?".length());
//	 String queryString = url;
//	 System.out.println(queryString);
//	
	
	
	//where=nexearch&sm=top_sug.pre&fbm=0&acr=1&acq=%EA%B3%A0%EC%96%91%EC%9D%B4&qdt=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=sk7kijw8
	//쿼리스트링은  키1=값1 & 키2=값2  저위에 것들을 각각 잘라서 보여줘야함
	// 즉 값은 쌍의 &로 구분 ,키와 값은 = 로 구분
}

public Ex250421() {
	super();
}
}
class MYUrl{
String protocol;
String domain;
String file;
String queryString;
Params[] params;

public void MyUrl(String url) {
String protocol = url.substring(0, url.indexOf("://"));
System.out.println(protocol);
url=url.substring(url.indexOf("://"))+"://".length();
System.out.println(url);

 String domain = url.substring(0,url.indexOf("/"));
 System.out.println(domain);
 url= url.substring(url.indexOf("/")+"/".length());

 String file = url.substring(0,url.indexOf("?"));
 System.out.println(file);
 url= url.substring(url.indexOf("?")+"?".length());
 
 
 queryString=url;
 String[]temps =queryString.split("&");
 params =new Param[tmps,length];
 for(int i=0; i<tmps.length;i++) {
	 String[] t =temps[]i. split("=");
	 params[i]=new Param(t[0],t[1]);
 }
}
//code 자주 사용 되는 기능 > 자동생성
 @Override
 public String toString() {
 	return String.format("Ex250421 [getClass()=%s, hashCode()=%s, toString()=%s]", getClass(), hashCode(),
 			super.toString());
 }
 class Param{
	 String key;
	 String value;
	 public Param(String key, String value) {
		 this.key =key;
		 this.value= value;
	 }
	@Override
	public String toString() {
		return String.format("Param [key=%s, value=%s]", key, value);
	}

 }

}