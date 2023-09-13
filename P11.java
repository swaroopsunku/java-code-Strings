package Strings;
import java.util.*;
public class P11 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the string :");
		String s=scan.nextLine();
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("The number of characters prasent in the string :"+count);
	}
}
