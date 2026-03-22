package java_core;

class Lg{
	void Select() {
		System.out.println("LG Brand");
	}
}
class Mobile extends Lg{
	void Select() {
		System.out.println("LG mobile");
	}
}
class Refrigirator extends Lg {
	void Select() {
		System.out.println("LG Refrigirator ");
	}
}
class Telivision extends Lg{
	void Select() {
		System.out.println("LG Telivision");
	}
}
class  Stimulator{
	static void Buy(Lg l) {
		l.Select();
	}
}

public class Mainclass {

	public static void main(String[] args) {
		Mobile m1=new Mobile();
		Refrigirator r1=new Refrigirator();
		Telivision t1=new Telivision();
		Stimulator.Buy(m1);
		Stimulator.Buy(r1);
		Stimulator.Buy(t1);
		
		
		
	

	}

}