package Stimulator;

class Mobiles5{
	void Features() {
		System.out.println("Features of mobiles");
	}
}
class Vivo5 extends Mobiles5{
	void Features() {
		System.out.println("vivo mobile");
	}
}
class Oppo5 extends Mobiles5{
	void Features() {
		System.out.println("Oppo mobiles");
	}
}
class Redmi5 extends Mobiles5{
	void Features() {
		System.out.println("redmi mobiles");
	}
}
class Simulator5{
	static void Purchase(Mobiles m)
	{
		m.Features();
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		Vivo v1=new Vivo();
		Oppo o1=new Oppo();
		Redmi r1=new Redmi();
		Simulator.Purchase(v1);
		Simulator.Purchase(o1);
		Simulator.Purchase(r1);
		

	}

}
