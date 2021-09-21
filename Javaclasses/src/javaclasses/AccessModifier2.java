package javaclasses;

public class AccessModifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifier amc2 = new AccessModifier();
		System.out.println("From Access Modifier Class -- " + amc2.a);
		amc2.test1();
		
	 // 	System.out.println(amc2.b); - Private Variable /method available only in the declared class 
		
		System.out.println();
		System.out.println(amc2.dvar); // Default Variable /method accessible in different class but same package
		amc2.dtest();
		
		
		
		
		
	}

}
