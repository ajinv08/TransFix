package javaclasses;

public class MethodTypesConcept {
	
	/* Method Requirements - 1. Return Type - void // static void
	 * 						 2. Method Name ()
	 * 						 3. Method Body
	 * 
	 * 						No Duplicate methods
	 */
	
	static void test1() { // Basic Method with out Parameter
		System.out.println("This is Basic Method with out Parameter");
		
	}

	static void test2(int a, int b, String s) { // Method with Parameter
		System.out.println("This is Multi Parameter Method with Parameter - " + a +" " + b +" "+ s);
		System.out.println("Operation in Method " + a*b);
	}
	
		
	static void test2(int a, String s, int b) {
		System.out.print(a+" " + s+" " +b+ " gives " );
		System.out.println(a+b);
		// Method overloading - same name of method but parameters are different
	}
	static int test3 (int j,int v) {
		int c = j+v;
		int k = j*v;
		return c+ k;
		
	}
	
	
	static int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Return Type from a Method" );
 int rc = test3(20,50);
 System.out.println(rc);
 MethodTypesConcept nobj = new MethodTypesConcept();
 
		
		test1();
		test2(2,3,"String Value or null");
		test2(2, "can be added to",5);
		
		System.out.println("Staic Variable accessing");
	
		b=25;
		System.out.println("Staic Variable direct accessing - " + b);
		b+=10;
		System.out.println("Staic Variable object accessing - " + nobj.b);
		nobj.b+=10;
		System.out.println("Staic Variable class accessing - " +MethodTypesConcept.b );
	}

}
