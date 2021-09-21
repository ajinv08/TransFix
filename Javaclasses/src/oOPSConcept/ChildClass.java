package oOPSConcept;

public class ChildClass extends ParentClass {
	
	static int c =2000;
	public static void childToParentTest() {
		System.out.println("Test the Accessability of Property" + c);
	}

	void testMethodOverRide() {
		//  super.testMethodOverRide();  // it gives automatic access to referred class
		System.out.println("Child Class - Testing from which class the method is called.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a+=10;
		parentMethod();
		
		ChildClass cc = new ChildClass();
		cc.b+=200;
		cc.parentInstanceMethod();
		childToParentTest();
		GrParentMethod();
		
		
		// Method overriding
		System.out.println("Method Overriding");
		cc.testMethodOverRide(); // this is called from Child class. It cannot take from Parent as same named method is overridden
	
		// Polymorphism
		System.out.println("Polymorphism");
		ParentClass pcx=new ChildClass();
		GrandParentClass gpcx = new ChildClass();
		pcx.testMethodOverRide();  // not working properly
		gpcx.testMethodOverRide();
				
	
	}

}
