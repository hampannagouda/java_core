package java_core;

abstract class demo {
	abstract void disp();
	abstract void test();
}
	
abstract class linearSearch extends demo{
	void disp() {
		System.out.print("mango");
	}
}
class Abstract extends linearSearch{
	
	void test() {
		System.out.print("juice");
	}
	public static void main(String[] a) {
		demo d1 = new Abstract();
		d1.disp();
		d1.test();
	}
}


