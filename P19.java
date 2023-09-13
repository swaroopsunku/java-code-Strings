package Strings;
import java.util.*;
public class P19 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
	    System.out.print("enter the string :");
	    String s1=scan.nextLine();
	    String s="";
	    int count=0;
	    for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e'|| s1.charAt(i)=='i'|| s1.charAt(i)=='o'|| s1.charAt(i)=='u'|| s1.charAt(i)=='A'|| s1.charAt(i)=='E'|| s1.charAt(i)=='I'|| s1.charAt(i)=='O'|| s1.charAt(i)=='U') { 
				count++;
			}
			if (count==0) {
				s+=s1.charAt(i);
			}
			count=0;
		}
	    System.out.println(s);
	   
	}
}
