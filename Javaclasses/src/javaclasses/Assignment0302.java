package javaclasses;

public class Assignment0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fn1 = "Anthony";
		String fn2 = "Anthony2";
		String fn3 = "Butcher";
		String ln1 = "Anthony";
		String ln2 = "Mendez";
		String ln3 = "Queen";
		String ad1 = "Long Address Line 1 to work on the String Manipulation Assignment on Emp 1";
		String ad2 = "Long Address Line 12 to work on the String Manipulation Assignment on Emp 2";
		String ad3 = "Long Address Line 123 to work on the String Manipulation Assignment by Queen";
		String email1 ="email1@gmail.com";
		String email2 ="email12@gmail.com";
		String email3 ="email123@gmail.com";
		String dob1 = "03/02/1985";
		String dob2 = "03/02/88";
		String dob3 = "12/15/1991";
		double monsal1 = 4500.45d;
		double monsal2 = 5100.32d;
		double monsal3 = 3800.50d;
		double monexp1 = 4800.05d;
		double monexp2 = 4100.25d;
		double monexp3 = 2800.85d;
		int count = 1;		
		// Length of first name
		System.out.println("Length of \"First Name\" of employee 1 is : " + fn1.length());
		
		// Display Full Name of Employee
		System.out.println(" Name \n Employee 2 : " + ln2 + " " + fn2);
	    System.out.println();
		
		// uppercase
//		System.out.println("Name of Employee 2 in Upper case  : " + ln2.toUpperCase() + " "+ fn2.toUpperCase());
		
		// character at a position
//		System.out.println( "What is in 23rd Position (indexed) of Add3 : " + ad3.charAt(23));
		
		// Position of Char / string
//		System.out.println(" Position of \"work\" in Add1 : " + ad1.indexOf("work") );
		
		// Position of string after certain index , last occurrence
//		System.out.println("First occurrence of \"on\" in ad1 after the Index 30 : " + ad1.indexOf("on", 30));
//		System.out.println("Last occurrence of \"on\" in ad1 : " +ad1.lastIndexOf("on"));
		
	    // Position of string backwards from the given index 
//		System.out.println("Last occurrence of \"on\" in ad1 backwards from index 30  : " +ad1.lastIndexOf("on",30));
		
		// equals & comparison
		
		
//		String ufn1 = fn1.toUpperCase();
//		String uln1 = ln1.toUpperCase();
//		System.out.print(fn1 +" & " + ln1 + " - Checks the equality using arithamatical operation : " );
//		System.out.println(fn1==ln1);
//		System.out.print(ufn1 +" & " + uln1 + " - Checks the equality using arithamatical operation : " );
//		System.out.println(ufn1==uln1);
//		System.out.print(fn1 +" & " + ln1 + " - Checks the equality using string equal method : " );
//		System.out.println(fn1.equals(ln1));
//		System.out.print(ufn1 +" & " + uln1 + " - Checks the equality using string equal method : " );
//		System.out.println(ufn1.equals(uln1));
//		
//		System.out.print(ufn1 +" & " + uln1 + " - Checks the equality using string comparison method : " );
//		System.out.println(ufn1.compareTo(uln1));
//		
//		System.out.print(ufn1 +" & " + ln1 + " - Checks the equality using string comparison operator Ignore Case : " );
//		System.out.println(ufn1.compareToIgnoreCase(ln1));
//		
		
		// Contains
		
		System.out.print("Checks the word \"work\" is in ad1 : " );
		System.out.println(ad1.contains("work"));
		System.out.println("Checks the variabale ln3 is in ad3 : " + ad3.contains(ln3));
//		
		// replace
//		
		System.out.println("\"123\" in " + email3+ " is now replaced by 3 - " + email3.replace("123","3"));
//		
//		// replace first and replace all
		String r1 = "on";
		String r2 = "  ooon  ";
		System.out.println("Replace Method    - " + ad1.replace("on", "  ooon  "));
		System.out.println("Repl w/ Variables - " + ad1.replace(r1, r2));
		System.out.println("Replace All       - " + ad1.replaceAll(r1, r2));
		System.out.println("Replace First     - " + ad1.replaceFirst(r1, r2));
		
//		Substring / Sub Sequence
		
		System.out.println(" Substring from \"ad1\" Index 35 to 50   -" + ad1.substring(35,54));
		System.out.println(" Substring from \"ad1\" Index 35 to end  -" + ad1.substring((35)));
		System.out.println(" SubSequence from \"ad1\" Index 35 to 50 -" + ad1.subSequence(35, 54));
	
		// STRING BUILDER
		
		StringBuilder sb1=new StringBuilder(ad1);
		StringBuilder sb2 = new StringBuilder("Test Direct Input to string builder variable");
		System.out.println("Direct Input in String Builder is Success " + sb2);
		System.out.println("Length of the string : " + ad1.length());
		System.out.println("Capacity of String Builder is Length of String + 16 : " + sb1.capacity());
		System.out.println(sb1.append(" - Test Append"));
		System.out.println(sb1.append (12.35d));
		System.out.println(sb1.delete(0, 5));
		System.out.println(sb1.replace(0, 7, "SB Replace Method"));
		System.out.println(sb1.reverse());
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		System.out.println(sb1.toString());
	}

}
