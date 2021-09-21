package oOPSConcept;

public class UnderstandEncapsulation  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation ec=new Encapsulation();
		ec.a = "30031978";  // a is non secured variable and can be accessed here
		// ec.dob & ec.ssn  - these are protected.
		// we have to use the methods
		
		ec.setDOB("Input DOB through Method");
		ec.setSSN("Input the SSN through Method");
		
	System.out.println(ec.getDOB());
	System.out.println(ec.getSSN());
		
	}

}
