package javaclasses;

public class AccessModifier {

	/*
	 * Access Modifiers - Method & Variable
	 * 1. Public - The code is accessible for all classes
	 * 2. Private - The code is only accessible within the declared class
	 * 3. Default - The code is only accessible in the same package. This is used when you don't specify a modifier.
	 * 4. Protected - The code is accessible in the same package and subclasses.
	 */
	
	/*
	 * Access Modifiers - Class
	 * 1. public	- The class is accessible by any other class	
	 * 2. default	- The class is only accessible by classes in the same package. This is used when you don't specify a modifier.
	 * 3. final     -  accessible same class only. No Instance possible 
	 */
	
	// Private
	private int b = 102;
	private void testpvt() {
		System.out.println("Private Accessible Method & Variables" + b);
	}
	
	// Public
	public String a = "Public Accessible Variable";
	public void test1() {
		System.out.println("Public Accessible Method");
	}
	
	// Default
	 String dvar = "Default Variable ";
	 void dtest() {
		 System.out.println("Default Accessible Method");
	}
	
	 
	 // Protected
	 
	 protected String pvar = " Proctected Variable ";
	 protected void testprot() {
		 System.out.println("Default Accessible Method");
	 }
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier amc = new AccessModifier();
		System.out.println(amc.a);
		amc.test1();
		System.out.println();
		
		System.out.println(amc.b);
		amc.testpvt();
		System.out.println();
		
		System.out.println(amc.dvar);
		amc.dtest();
		System.out.println();
		
		System.out.println(amc.pvar);
		amc.testprot();
		System.out.println();
		
		
		
		
		
		
		
	}

}
