package Strings;
import java.util.*;
public class P17 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	    System.out.print("enter the string :");
	    String s1=scan.nextLine();
	    String[] s=s1.split(" ");
	    int min=0,t2=0;
	    int postion=0;
	    for (String t1:s) {
	    	if(min<t1.length()) {
	    		min=t1.length();
	    		postion=t2;
	    	}
	    	t2++;
	    }
	    System.out.println(s[postion]);
	}
}
