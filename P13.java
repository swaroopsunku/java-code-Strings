package Strings;
import java.util.*;
public class P13 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the string :");
		String s=scan.nextLine();
		String[] s1=s.split(" ");
		for (String string : s1) {
			System.out.print(string);
		}
	}
}
