package oOPSConcept;

public class GrandParentClass {

	static int ga=0;
	public static void GrParentMethod() {
		System.out.println("From Grand Parent Class. STatic method " + ga);
	}
	
	void testMethodOverRide() {
		System.out.println("Grand Parent - Testing from which class the method is called.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
