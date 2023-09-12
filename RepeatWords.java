package practice;
import java.util.*;
public class RepeatWords {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter the string :");
		String s=scan.nextLine();
		String[] s1=s.split(" ");
		 for (int i = 0; i <s1.length; i++) {
		      int count=0;
		      for (int j = 0; j < s1.length;j++) {
		        if(s1[i].equals(s1[j]) && i>j) {
		          break;
		        }
		        if(s1[i].equals(s1[j])) {
		          count++;
		        }
		      }
		      
		      if(count>0) {
		        System.out.println("The occurance of '"+s1[i]+"' is: "+ count);
		      }

		    }
	}
}
