package Strings;

import java.util.Scanner;

public class CharAt {

	public static void main() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the String : ");
		String s= in.next();
		System.out.println("entered String is : "+s);
		System.out.println("enter the char position(index)");
		int idx = in.nextInt();
		System.out.println("the charecter is : "+s.charAt(idx));
		in.close();
	}
}
