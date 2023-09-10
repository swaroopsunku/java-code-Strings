package Strings;
import java.util.*;
public class P2 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the string :");
		String s=scan.nextLine();
		char [] c=s.toCharArray();
		System.out.print('[');
		for (int i = 0; i < c.length; i++) {
			if (c[i]!=' ') {
				System.out.print(c[i]+",");
			}
		}
		System.out.println("]");
	}
}
