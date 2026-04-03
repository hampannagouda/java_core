package Stimulator;

class Mobiles{
	void Features() {
		System.out.println("Features of mobiles");
	}
}
class Vivo extends Mobiles{
	void Features() {
		System.out.println("vivo mobile");
	}
}
class Oppo extends Mobiles{
	void Features() {
		System.out.println("Oppo mobiles");
	}
}
class Redmi extends Mobiles{
	void Features() {
		System.out.println("redmi mobiles");
	}
}
class Simulator{
	static void Purchase(Mobiles m)
	{
		m.Features();
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		Vivo v1=new Vivo();
		Oppo o1=new Oppo();
		Redmi r1=new Redmi();
		Simulator.Purchase(v1);
		Simulator.Purchase(o1);
		Simulator.Purchase(r1);
		

	}

}
