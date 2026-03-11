package java_core;

public class method_overriding {

	public static void main(String[] ar) {
		version_2 v2 = new version_2();
		v2.send();
	}
}
class version_1{
	void send() {
		System.out.println("sending only photos");
	}
}
class version_2 extends version_1{

	void send() {
		super.send();
		System.out.println("seding photos with music");
	}
}
