package java_core.Stimulator;

class Mobiles2{
	void Features() {
		System.out.println("Features of mobiles");
	}
}
class Vivo2 extends Mobiles2{
	void Features() {
		System.out.println("vivo mobile");
	}
}
class Oppo2 extends Mobiles2{
	void Features() {
		System.out.println("Oppo mobiles");
	}
}
class Redmi2 extends Mobiles2{
	void Features() {
		System.out.println("redmi mobiles");
	}
}
class Simulator2{
	static void Purchase(Mobiles m)
	{
		m.Features();
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		Vivo v1=new Vivo();
		Oppo o1=new Oppo();
		Redmi r1=new Redmi();
		Simulator.Purchase(v1);
		Simulator.Purchase(o1);
		Simulator.Purchase(r1);
		

	}

}
