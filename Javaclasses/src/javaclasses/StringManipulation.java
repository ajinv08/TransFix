package javaclasses;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String varname = " Value of of the variable name";
System.out.println(varname);
// String varname = "New Value"  - this is duplication and not allowed
varname = " New Value of the variable-directly assigned";
System.out.println(varname);

// String Functions

// LENGTH

String a = "Test DATA for Testing String Functions";
System.out.println("Length of Text " + a.length());
int len = a.length();
System.out.println(len);

// UPPERCASE & LOWERCASE

System.out.println(a.toUpperCase());

System.out.println(a.toLowerCase());

// PULL OUT A PARTICULAR PART FROM STRING - counting as indexed starting position as zero"

System.out.println("Character at the 6 postion " + a.charAt(6));

// POSTION OF A CHARACTER - index based means counting from zero, and first occurrence

System.out.println(" First Position of F is " + a.indexOf('F'));
System.out.println(" First Position of 'Test' is " + a.indexOf("Test",2));

// LAST POSTION OF A CHARACTER - index based means counting from zero,

System.out.println(" Last occurence of t is " + a.lastIndexOf('t'));

// methods not available to give other than first and last occurrence

// STRING COMPARISON -equals & compareTo methods

String a1 = "Test Comparison";
String a2 = "Test Comparison";

System.out.println(a1==a2); // this may work some times. 

System.out.println("String Cmparison " + a1.equals(a2)); // equals is the correct method -boolean output

a2=a2.toUpperCase();
System.out.println("Upper case of a2 --  " + a2);
System.out.println("String Cmparison with Ignore Case is -- " + a1.equalsIgnoreCase(a2));

/// STRING COMPARISON WITH INTIGER OUTPUT

System.out.println(" With compareTo Function " + a1.compareTo(a2)); // if the value is not zero then it is false
System.out.println(" With compareTo Function with case ignoring " + a1.compareToIgnoreCase(a2)); // value is zero - means the string are comparable

String a3 = "New Functon Concatenation";
String a4 = "New Functon concatenation";

// Concatenation methods - + sign and concat() method

System.out.println(a1+ " " + a3);

System.out.println( a1.concat(" " + a3));


// PRESESENCE of a text in the string - contains() method

System.out.println("Presence of given string 'funct' " + a3.contains("funct"));


System.out.println("Contains can be used to check equals " +  a3.contains(a4));

// REPLACE a part from String  

System.out.println("Replace Method " + a4.replace(" ", " test replace space "));
System.out.println(a4.replace(" ", " test replace space "));

// TRIM

String a5 = "123456789with lots of trimmble space now trimmed     ";
System.out.println(a5.trim());


// SUBSTRING

System.out.println("Substring is taken out ---" + a5.substring(5,6));

// SPLIT - based on condition provided (Regular Expression - regex) - results in multiple strings and to be stored
// as array - will study later

//a5.split();


// STRINGBUILDER

	StringBuilder sb=new StringBuilder();
	
// STRINGBUFFER
  
	StringBuffer sbf =new StringBuffer();









	}

}
