package Strings;
import java.util.*;
public class P8 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter the string :");
		String s=scan.next();
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i)==s.charAt(j)&&i>j) {
					break;
				}
				if (s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if (count>0) {
				System.out.println(s.charAt(i)+""+count);
			}
			
		}
	}

}
