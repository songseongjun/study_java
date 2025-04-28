package Lesson17_1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NaverEX {
	//http://ww.naver.com
	// url>isr>br(readLine)
public static void main(String[] args)throws Exception {
	URL url =new URL("http://git-scm.com");
	InputStream is =url.openStream();
	InputStreamReader isr =new InputStreamReader(is);
	BufferedReader br =new BufferedReader(isr);
	
	int line =1;
	while(true) {
		String s =br.readLine();
		if(s == null) break;
		System.out.println(line++ + "::" + s);
	}
}
}
