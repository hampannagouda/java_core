package java_core;
class Amazon{
	void Buy() {
		System.out.println("buy from amazon");
	}
}
class Shoes extends Amazon{
	void Buy() {
		System.out.println("shoes");
	}
}
class Dress extends Amazon{
	void Buy() {
		System.out.println("dress");
	}
}
class Mobile1 extends Amazon{
	void Buy() {
		System.out.println("Mobiles");
	}
}
class  Stimulator5{
	static void Purchase(Amazon a) {
		a.Buy();
	}
}

public class Mainclass1 {

	public static void main(String[] args) {
		Shoes s1=new Shoes();
		Dress d1=new Dress();
		Mobile1 t1=new Mobile1();
		Stimulator5.Purchase(s1);
		Stimulator5.Purchase(d1);
		Stimulator5.Purchase(t1);


	}

}