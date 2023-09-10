package Strings;
import java.util.*;
public class P7 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the string :");
		String s=scan.nextLine();
		System.out.print("Enter the element to check : ");
		char c= scan.next().charAt(0);
		int count=0;
		for (int i = 0; i <s.length(); i++) {
			if (s.charAt(i)==c) {
				count++;
			}
		}
		if (count>0) {
			System.out.println("The element is present in the String :");
		} else {
			System.out.println("The element is not present in the String :");
		}
		
	}
}
