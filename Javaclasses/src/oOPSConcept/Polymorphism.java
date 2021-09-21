package oOPSConcept;

class Cars {
		void carsMethod(){
		System.out.println(" All Cars are machines");
	}}

class Benz extends Cars{
		void carsMethod () {
		super.carsMethod();
		System.out.println("Benz Cars are Chaufer Driving machines");
	}}

class Bmw extends Cars {
	void carsMethod() {
		super.carsMethod();
		System.out.println("BMW Cars are Self Driving machines");
	}}

public class Polymorphism extends PolyParent {
	public static void main(String[] args) {
	
	Cars ccar = new Cars();
	Benz bcar = new Benz();
	Bmw wcar = new Bmw();
			
	bcar.carsMethod();
	wcar.carsMethod();
		
		
		
		
		
		
		

	}

}
