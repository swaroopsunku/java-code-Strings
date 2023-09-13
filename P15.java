package Strings;
import java.util.*;
public class P15 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	    System.out.print("enter the string :");
	    String s1=scan.nextLine();
	    String s="";
	     
	    for(int i=0;i<s1.length();i++) {
	    	if(s1.charAt(i)==' ') {
	    		System.out.print(s+" ");
	    		s="";
	    	}
	    	s=s1.charAt(i)+s;
	    }
	    System.out.print(s);
	}
}
