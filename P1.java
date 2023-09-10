package Strings;
import java.util.*;
public class P1 {
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of array :");
		int size=scan.nextInt();
		char[] a=new char[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the character :");
			a[i]=scan.next().charAt(0);
		}
		String s="";
		for (int i = 0; i < a.length; i++) {
			s+=a[i];
		}
		System.out.println(s);
	}
}
