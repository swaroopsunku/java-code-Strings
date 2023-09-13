package Strings;
import java.util.*;
public class P16 {
	static Scanner scan=new Scanner(System.in);
	 public static void main(String[] args) {
		    System.out.print("enter the string :");
		    String s=scan.nextLine();
		    String str="";
		    for (int i = 0; i < s.length(); i++) {
				if (str.indexOf(s.charAt(i))== -1) {
					str=str+s.charAt(i);
				}
			}
			System.out.println(str);
		 }

}
