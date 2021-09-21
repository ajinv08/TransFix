package oOPSConcept;

public class Encapsulation {
	
	// Capsule => data hiding /mining
	//1. Declare the variables of a class as private
	//2. Provide Public setter and getter methods to modify and view the variables values

	private String dob;
	private String ssn;
	String a;
	public  void setDOB(String dob) {
		this.dob=dob;
	}
	
	public String getDOB () {
		return dob;
	}
	
	public  void setSSN(String ssn) {
		this.ssn=ssn;
	}
	
	public String getSSN () {
		return ssn;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encapsulation en = new Encapsulation();
		en.setDOB("30.03.73");
		String dfb = en.getDOB();
		en.getDOB();
		System.out.println(dfb);
	}

}
