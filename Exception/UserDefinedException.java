package java_core;

import java.util.Scanner;

public class UserDefinedException {
	public static void main(String[] a) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter amount to be withdrawn :");
		int num = in.nextInt();
		try {
			ATM.withDraw(num);	
		}catch(Bank e) {
			System.out.println(e.getMsg());
		}
		finally {
			System.out.println("program completed..");
		}
		in.close();
	}
}
class ATM {
	static int amt = 1000;
	static void withDraw(int usamt) throws Bank{
		if(usamt <= amt) {
			System.out.println("traction succefully");
		}else {
			throw new Bank("low amount");
		}
	}
}
class Bank extends Exception{
	String msg = "" ;
	Bank(String msg) {
		this.msg = msg;
	}
	String getMsg() {
		return msg;
	}
}
