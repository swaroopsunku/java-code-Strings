package Strings;
import java.util.*;
public class P14 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the string :");
		String s=scan.nextLine();
		String[] s1=s.split(" ");
		int count=0;
		for (int i = 0; i < s1.length; i++) {
			count++;
		}
		System.out.println("The number of words prasent in string is :"+count);
	}
}
