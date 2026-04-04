package java_core.Interface;

public class omini implements car {
	public void start() {
		System.out.println("omini starts");
	}
	public void stop() {
		System.out.println("omini stops");
	}
	public static void main(String []a) {
		omini o1 = new omini();
		o1.start();
		o1.stop();
	}

}
