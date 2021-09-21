package javaSelfMain;

class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	}

	class Dog extends Animal {
	  
	   public void bark() {
	      System.out.println("Dogs can bark");
	   }
	   
	 
	}

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal ();   // Animal reference and object
	    Dog b = new Dog();   // Animal reference but Dog object

	      a.move();   // runs the method in Animal class
	      b.move();   // runs the method in Dog class
	      b.bark();	  // runs 	

	}

}
