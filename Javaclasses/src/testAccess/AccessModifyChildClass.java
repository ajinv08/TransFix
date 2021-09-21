package testAccess;

import javaclasses.AccessModifier;
public class AccessModifyChildClass extends AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifyChildClass amc =new AccessModifyChildClass();
		System.out.println(amc.pvar);  // Protected Variable & Methods accessed in Child Class in a different class
		amc.testprot();
		System.out.println();
	}
	}


