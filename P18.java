package Strings;
import java.util.*;
public class P18 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
	    System.out.print("enter the string :");
	    String s1=scan.nextLine();
	    
	    System.out.print("enter the character :");
	    char s2=scan.nextLine().charAt(0);
	    
	    int index = s1.indexOf(s2);
	    if(index!=-1)
	    System.out.println("it is present postion is "+index);
	    else
	    	System.out.println("not present");
	}
}
