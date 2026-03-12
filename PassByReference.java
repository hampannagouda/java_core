package java_core;

public class PassByReference {

		int x = 10;
		public static void main(String[] args) {
			PassByReference d1 = new PassByReference();
			System.out.println(d1.x);
			add(d1);
		}

		static void add(PassByReference d2) {
			System.out.println(d2.x);
		}
	}