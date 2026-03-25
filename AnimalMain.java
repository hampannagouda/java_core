package java_core;
class dog implements Animal{
	public void noise() {
		System.out.println("bow bow ...");
	}
}
class snack implements Animal{
	public void noise() {
		System.out.println("buusss...");
	}
}
class cat implements Animal{
	public void noise() {
		System.out.println("meow meow ...");
	}
}
class simulator{
	static void access(Animal a) {
		a.noise();
	}
}
public class AnimalMain {
	public static void main(String[] a)
	{
		Animal d = new dog();
		Animal c = new cat();
		Animal s = new snack();
		simulator.access(d);
		simulator.access(c);
		simulator.access(s);
	}
}
