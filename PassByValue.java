package java_core;

public class PassByValue {
	public static void main(String[] args) {
		int d1 = 10;
		demo6.add(d1);
	}

}
class demo6{
	static void add(int d1) {
		System.out.println(d1);
	}
}


