package Lesoon12_1;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DateEx {
public static void main(String[] args) {
	Date now =new Date();
	System.out.println(now.toString());
	System.out.println(now.toLocaleString());
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
	System.out.println(sdf.format(now));

}
}
