package demo;

import java.util.Scanner;

public class S3 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the string : ");
		String str = scan.next();
		String[] a = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			String s = a[i];
			while (number(s, str)) {
				sum += (i + 1);
				str = remove(s, str);
			}
		}
		System.out.println(sum);
		System.out.println(str);
	}

	public static boolean number(String s, String str) {
		str = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (str.contains(s.charAt(i) + "")) {
				count++;
			}
		}
		if (s.length() == count) {
			return true;
		} else {
			return false;
		}
	}

	public static String remove(String s, String str) {
		String add = "";
		String ev = "";

		for (int i = 0; i < str.length(); i++) {

			if (!s.contains(str.charAt(i) + "")) {
				add += str.charAt(i);
			} else {
				ev += str.charAt(i);
			}

		}
		for (int i = 0; i < ev.length(); i++) {
			int count = 0;
			for (int j = 0; j < ev.length(); j++) {
				if (ev.charAt(i) == ev.charAt(j) && i > j) {
					break;
				}
				if (ev.charAt(i) == ev.charAt(j)) {
					count++;
				}
			}
			count--;
			if (count > 1) {
				for (int j = 0; j < count - 1; j++) {
					add += ev.charAt(i);
				}
			}
		}
		return add;
	}

}
