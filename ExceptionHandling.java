package java_core;

import java.util.Scanner;

public class ExceptionHandling {
public static void main(String []a) {
	Scanner in = new Scanner(System.in);
	try {
		System.out.println("enter the number number");
		int num = in.nextInt();
		System.out.println("enter the devider");
		int div = in.nextInt();
		System.out.println("the division is"+num/div);	
		System.out.println("enter the array size");
		int n = in.nextInt();
		System.out.println("enter the array elements");
		int []arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("enter the index element to be printed");
		int ind = in.nextInt();
		System.out.println("arr index element"+arr[ind]);
		System.out.println("enter the element to convert from String to Integer");
		int inNum = Integer.parseInt(in.next());
		System.out.println("the entered number is"+inNum);
		ExceptionHandling x = new ExceptionHandling();
		System.out.println(x.hashCode());
	}catch(ArithmeticException e) {
		System.out.println(e);
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}catch(NullPointerException e) {
		System.out.println(e);
	}catch(NumberFormatException e) {
		System.out.println(e);
	}finally {
		System.out.println("executed succefully...");
	}
} 
}

