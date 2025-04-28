package Lesson17_1;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class BrEx {
public static void main(String[] args)throws Exception {
	// 특정 파일을 문자기반 스트림입력
	FileReader fr =new FileReader("output2.txt");
	//버퍼 기반의 보조 스트림 사용
	BufferedReader br =new BufferedReader(fr);
	
	String str;
	while((str=br.readLine())!=null) {
		System.out.println(str);
	}
	br.close();
	//이거 반복한게 저위에꺼
//	String str=	br.readLine();
//	System.out.println(str);
	// 문자<> 바이트
	//입력시 바이트>> 문자기반으로바뀜
	FileInputStream fis =new FileInputStream("output2.txt");//애가
	InputStreamReader isr =new InputStreamReader(fis);//애한테 덮어씌워짐
	BufferedReader br2 =new BufferedReader(isr);//이걸하면 한줄단위해석가능
	// 출력시 문자가>> 바이트로바뀜
	OutputStreamWriter osw;
	
	
	
	
}
}
