package javaclasses;

public class LoopAssignmnt030621 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "malayalam";  // original string
int b = a.length()-1;

StringBuilder rev1=new StringBuilder();  // for 1st Reversal
StringBuilder rev2=new StringBuilder();  // for 2nd reversal

String a1=""; // for 1st Reversal
String a2=""; // for 2nd reversal

System.out.println("Original String                              : " +a);

while (b>=0) {
	rev1.append(a.charAt(b));
	a1=a1+a.charAt(b);
	b=b-1;
}

System.out.println("\r");
System.out.println("1st Reversal Process ! \r");

System.out.println("String Reversed through String Builder       : " + rev1);
System.out.println("String Reversed through String Concat Method : " +a1);
	

    System.out.println("\r");
	System.out.println("2nd Reversal Process ! \r");
	
	for (int b1 =a1.length()-1; b1>=0;b1--) {
	rev2.append(a1.charAt(b1));
	a2=a2+a1.charAt(b1);
	
	}
	
	System.out.println("String Reversed through String Builder       : " + rev2);
	System.out.println("String Reversed through String Concat Method : " +a2);
	
	
	System.out.println("\r");
	System.out.println("String Comparisons ! \r");
	
	System.out.println("  String Bulider Method & Concat Method ");
	String rev1s=rev1.toString();
	String rev2s=rev2.toString();
	if (rev1s.equals(a1)) 
	System.out.println("	1st Reversal Out Put through Both Methods are Same");
	else
	System.out.println("	1st Reversal Out Put through Both Methods are Not Same");
	
	if (rev2s.equals(a2)) 
	System.out.println("	2nd Reversal Out Put through Both Methods are Same");
	else
	System.out.println("	2nd Reversal Out Put through Both Methods are Not Same");
	
	System.out.println("\r  Lets Compare Original and Outputs !! \r");
	if (a.equals(rev1s))
	System.out.println("	1st Reversed String & Original are Same - its a Palindrome !");
	else
	System.out.println("	1st Reversed String & Original are Not Same");
	
		
	if (a.equals(rev2s))
	System.out.println("	2nd Reversed String & Original are Same - Reversal Processes were OK");
	else
	System.out.println("	2nd Reversed String & Original are Not Same - Some mistake in Code");
	
	if (rev1s.equals(rev2s))
	System.out.println("	2nd Reversed String & 1st Reversed String are Same - its a Palindrome !");
	else
	System.out.println("	2nd Reversed String & 1st Reversed String are Not Same ");
		
	
}
}
