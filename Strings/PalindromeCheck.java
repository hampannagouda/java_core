package Strings;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] a) {
		Scanner in= new Scanner(System.in);
		System.out.println("enter the string : ");
		String s= in.next();
		if(s.equals(revStr(s))) {
		System.out.println("the String is palindrome");
		}else {
			System.out.println("the string is not a palindrome");
		}
		in.close();
	}
	static String revStr(String s) {
		String res = "";
		for(int i=s.length()-1;i>=0;i--) {
			res += s.charAt(i);
		}
		return res;
	}
}
