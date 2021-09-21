package javaclasses;

public class StaticNonStaticConcept {
	
	int a=100; // non-static / instance variable / can be accessed with class only
	static int b = 205 ; // static / class variable / can be accessed directly,with class, with object

	void test1() { // non-static method
		
	}
	
	static void test2() {// static method
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStaticConcept svclass = new StaticNonStaticConcept();
	//	System.out.println(a); - not possible to call directly
		System.out.println(svclass.a); // nonstatic called through object
		System.out.println(b);  // possible to call directly
		System.out.println(svclass.b); // calling through object
		System.out.println(StaticNonStaticConcept.b); // calling trough class
	//	System.out.println(StaticNonStaticConcept.a); not possible to call through class
	}

}
