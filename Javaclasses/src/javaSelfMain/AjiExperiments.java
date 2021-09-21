package javaSelfMain;

class TryRange{									// declared a class
	int fuelcap,passengers;
	double mpg;
	
	TryRange(int a,int b, double c){			// declared a constructor to initialize the parameters
		 fuelcap=a;
		 passengers=b;
		 mpg=c;
	}
	
	void range() {							// declared a method for calculation
		System.out.println("Passengers " + passengers + " and Range is " + fuelcap*mpg);
		
	}}
 

public class AjiExperiments {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		TryRange minivan = new TryRange(15,7,25);    // inputs the value
		TryRange sportcar = new TryRange(10,2,8);    // inputs the value
		TryRange regSUV	= new TryRange(15,5,20);    // inputs the value	

		minivan.range();							// call the method
		sportcar.range();							// call the method
		regSUV.range();							    // call the method
		
	}}
