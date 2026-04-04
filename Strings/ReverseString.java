package java_core.Strings;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] a) {
	Scanner in= new Scanner(System.in);
	System.out.println("enter the string : ");
	String s= in.next();
	System.out.println("the reversed String is : "+revStr(s));
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


