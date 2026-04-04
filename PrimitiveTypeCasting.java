package java_core;

public class PrimitiveTypeCasting {

	public static void main(String[] ag) {
		//widening type casting both (implicitly and explicitly)
		
		//implicitly
		double z = 23.0f;
		System.out.println(z);
		
		//explicitly
		double x = (double)10;
		System.out.println(x);
		
		//narrowing type casting both (only explicitly)
		int y = (int)50.23f;
		System.out.println(y);
	}
}
