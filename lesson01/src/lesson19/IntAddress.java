package lesson19;

import java.net.InetAddress;

public class IntAddress {
public static void main(String[] args)throws Exception {
	InetAddress ip =InetAddress.getByName("www.naver.com");//아이넷Address라는객체를만들어냄
	System.out.println("호스트명 :"+ ip.getHostName());//위에 객체를쓰면 호스트명과 ip를알아낼수있음
	System.out.println("ip:"+ip.getHostAddress());
	
	//ip전체
	InetAddress[] ips =InetAddress.getAllByName("www.naver.com");//getAllbyname여기에붙어있는 모든주소를 가져와주세요
	//dns는 도메인 메인서버 제일 놀고있는애를찾음 그래서 ip제일위에있는애가온거
	for(InetAddress i:ips) {
		System.out.println("ip 주소:" + i);
	}
	
	byte[]ipAddr =ip.getAddress();//이걸하게되면 byte배열로나오게됨 
	for(byte b:  ipAddr) {
		System.out.println((b < 0 ? b + 256 : b)+ ".");//음수값도 나올수있어서 256이라했음
	}
	System.out.println();
	InetAddress local = InetAddress.getLocalHost();
	System.out.println("내컴퓨터 ip:"+ local);
	
	InetAddress ip2 =InetAddress.getByAddress(ips[0].getAddress());
	System.out.println(ips[0].getHostAddress()+"주소:"+ip2);
	System.out.println("192.168.0.27");
}
}
