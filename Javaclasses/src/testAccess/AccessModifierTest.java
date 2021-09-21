package testAccess;

import javaclasses.AccessModifier;

public class AccessModifierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier amc3 = new AccessModifier();
		System.out.println("Public accessable in Difference Class " + amc3.a);
		amc3.test1();
	
//	 	System.out.println(amc3.b); - Private Variable /method available only in the declared class & package
		
		System.out.println();
		// System.out.println(amc3.dvar); // Default Variable /method not accessible in different  package
		// amc3.dtest();
		
		
	}
	

}
