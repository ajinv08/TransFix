package javaclasses;

import java.util.*;

// public static void addition(double a, double b) {
	// double c = a +b;
	//return c;
//}
public class ScannerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create instance of scanner class
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter First Name\n");
		String firstName = scan.nextLine();
		System.out.println(" Enter Last Name\n");
		String lastName =scan.next();
		System.out.println("Welcome - " + firstName + " " + lastName);
		
		System.out.println(" Enter Values");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		scan.close();
		
	}

}
