package java_core.Exception;

import java.util.Scanner;

public class ExceptionHandling2 {
	public static void main(String[] a) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the num1 :");
		int num = in.nextInt();
		System.out.println("enter the num2 :");
		int num2 = in.nextInt();
		System.out.println("enter the operator (+ - * /) :"+"the result is");
		in.nextLine(); 
		try {
		char op = in.nextLine().charAt(0);
		switch(op ) {
		case '+' :{
			System.out.println(num+num2);
			break;
		}
		case '-' :{
			System.out.println(num-num2);
			break;
		}
		case '*' :{
			System.out.println(num*num2);
			break;
		}
		case '/' :{
			System.out.println(num/num2);
			break;
		}
		default:
	        System.out.println("Invalid operator!");
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("program completed..");
		}
		in.close();
	}
}
