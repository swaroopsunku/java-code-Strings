package Strings;
import java.util.*;
public class P4 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the string :");
		String s=scan.nextLine();
		String s1="";
		for (int i = s.length()-1; i>=0; i--) {
			s1+=s.charAt(i);
		}
		if (s.equals(s1)) {
			System.out.println("it is palandrome");
		} else {
			System.out.println("not a palandrome");
		}
	}
}
