package javaclasses;



public class ConstructorConcept {
	static String k = "Variable connected to Parameter in Constructor";	

	ConstructorConcept(String x){
		this.k=x;
		System.out.println("automatically constructor is executed " + x);
	}

	ConstructorConcept(String a, String b, int c){
		System.out.println("Multi Parameter  constructor is executed - " + a +" " + b + " " + c);
	}
	public static void test() {
		System.out.println("Method to compare with Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		ConstructorConcept cc = new ConstructorConcept(k); // we have to creat the object to execute the Constructor. Or it will not be executed
		ConstructorConcept ccm = new ConstructorConcept("Test Multi Para constru ", " Success", 100);
	test();  // method to be called but constructor is executed automatically
	
	
	
	}}
