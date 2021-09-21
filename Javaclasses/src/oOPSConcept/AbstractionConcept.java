package oOPSConcept;

public abstract  class AbstractionConcept {

	// class vs abstract class
	/* 
	 * class need to have non-abstract methods only
	 * abstract class can have abstract & non abstract methods
	 * non abstract method - return type(void /data type), method name, paranthesis, method body
	 * abstract method - no need of method body. so basically it is just defining a method - peripherals of method
	 * 
	 */
	
	static void nonabstractMethodtest() {
		System.out.println("this is a non abstract method in the abstract class");
	}
	
	
	 abstract void abstractTestMethod();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractionConcept abc = new AbstractionConcept();
		nonabstractMethodtest();
		
	}

}
