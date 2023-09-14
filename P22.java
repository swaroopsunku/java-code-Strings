package Strings;
import java.util.*;
public class P22 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	    System.out.print("enter the string :");
	    String s1=scan.nextLine();
	    String[] s=s1.split(" ");
	    String max=s[0];
	    for (String t1:s) {
	    	if(max.length()<t1.length()) {
	    		max=t1;
	    	}
	    }
	    System.out.println(max+" count is "+max.length());
	}
}
