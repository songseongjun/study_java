package Lesson13;

import java.io.FileInputStream;

public class InputStreamEx {
public static void main(String[] args)throws Exception {
	FileInputStream fis =new FileInputStream("file.txt");
//			int b= fis.read();
//			System.out.println(b);
//			b=fis.read();
//			System.out.println(b);
//			for(int i=0; i<24; i++) {
//				int b =fis.read();
//				System.out.println(b+" :: "+(char)b);
//			}
//			System.out.println(fis.read());
			
			//EOF(End OF File)파일에 끝에 다다른다 여기에 다다르면 -1이나온다
	int b=0; 
	while((b=fis.read())!=-1) {
		System.out.println(b + ":: "+ (char)b);
	}
		  
}
}