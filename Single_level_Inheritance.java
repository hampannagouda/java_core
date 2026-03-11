package java_core;

class sample1{
	int value = 10;
}
class demo1 extends sample1{
	void print() {
		System.out.println("this is from demo class");
		
	}
}
public class Single_level_Inheritance {
	public static void main(String[] args) {
		demo1 d1 = new demo1();
		System.out.println(d1.value);
		d1.print();
		System.out.println("main method ends");		
	}
}
