package java_core.Abstract;

abstract class samp {
	abstract void disp();
	abstract void test();
}
class Abstract1 extends samp{
	void disp() {
		System.out.println("mango");
		}
	void test() {
		System.out.println("juice");
	}
	public static void main(String[] a) {
		Abstract d1 = new Abstract();
		d1.disp();
		d1.test();
	}
}
