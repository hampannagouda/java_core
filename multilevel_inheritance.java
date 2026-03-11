package java_core;
class sample{
	void print2() {
		System.out.println("sample class");	
	}
}
class demo extends sample{
	void print1() {
		System.out.println("demo class inherited sample");	
	}
}
class test extends demo{
	void print() {
		System.out.println("test class inherited property from demo and sample classes");	
	}
}

public class multilevel_inheritance {

	public static void main(String[] args) {
		test t1 = new test();
		t1.print();
		t1.print1();
		t1.print2();
	}
}
