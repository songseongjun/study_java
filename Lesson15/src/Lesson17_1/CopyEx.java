package Lesson17_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyEx {
public static void main(String[] args)throws Exception {
	//output2.txt 파일을 output3.txt 파일로 복사
	//FileInputStream, FileOutputStream사용
	
	FileInputStream fis = new FileInputStream("output2.txt");
	FileOutputStream fos =new FileOutputStream("output3.txt");	 
	//1번째
//	fos.write(fis.readAllBytes());

	//2번째
//	int b=0;
//	while((b = fis.read())!=-1) {
//		fos.write(b);
//	}
//	fos.write(fis.read());//1바이트만 저장한다
	byte[]bs =new byte[10];
	int length=0; 
	while((length = fis.read(bs))!=-1) {
	fos.write(bs, 0, length);	
	}
	fos.close();
	fos.close();
	}
}

