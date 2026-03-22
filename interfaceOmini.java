package java_core;

public class interfaceOmini extends omini{

		public void start() {
			System.out.println("omini starts");
		}
		public void stop() {
			System.out.println("omini stops");
		}
		public static void main(String []a) {
			interfaceOmini o1 = new interfaceOmini();
			o1.start();
			o1.stop();
		}

	}

