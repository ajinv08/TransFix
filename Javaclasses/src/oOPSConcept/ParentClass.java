package oOPSConcept;

public class ParentClass extends GrandParentClass {
 
	static int a=0;
	public static void parentMethod() {
		System.out.println("From Parent Class. STatic method " + a);
	}
	
	int b =1010;
	public  void parentInstanceMethod() {
		System.out.println("From Parent Class Instance Method " + b);
	}
	

	void testMethodOverRide() {
		//super.testMethodOverRide();
		System.out.println("Parent Class - Testing from which class the method is called.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass pc = new ParentClass();
		parentMethod();
		pc.parentInstanceMethod();
		// childToParentTest(); - property from Child class to parent not allowed
		
		GrParentMethod();
	}

}
