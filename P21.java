package Strings;
import java.util.*;
public class P21 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	    System.out.print("enter the string :");
	    String s1=scan.nextLine();
	    
	    System.out.print("enter the word :");
	    String s2=scan.nextLine();
	    
	    int index = s1.indexOf(s2);
	    if(index!=-1)
	    System.out.println(s2+" is present in the string");
	    else
	    	System.out.println(s2+" not present in the  string");
	}
}
