package Utils;
import java.util.Scanner;

public class BankUtils {
   private static final Scanner scanner =new Scanner(System.in);
   
    public static String nextLine(String msg) {
	   System.out.print(msg);
	   return scanner.nextLine();
   }
   
  public static int nexInt(String msg) {
	   return Integer.parseInt(nextLine(msg));
   }
  public static long nexlong(String msg) {
	   return Long.parseLong(nextLine(msg));
  }
 
  
  public static boolean nextConfirm(String msg) {
	String s =nextLine(msg+"{y/n]");
	return s.equalsIgnoreCase("y")||s.equalsIgnoreCase("yes");
  }

}
