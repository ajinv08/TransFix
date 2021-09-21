package javaclasses;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList(); // non-parameterized
		a1.add("Tom");
		a1.add(41);
		System.out.println(a1.get(1)); // display individual raw
		System.out.println(a1);  // display full data
		
		
		ArrayList <String> a2 =new <String> ArrayList(); // parameterized
		a2.add("String Values only");
		// a2.add(32); // only string values to this parameterized array
		a2.add("41");
		a2.add("Test");
		a2.add(2,"4th Data"); // input to specific index
		System.out.println(a2.size());
		System.out.println(a2);
		
		String test = "Test to Check the string Method";
		System.out.println(test.contains("check"));
		
	}

}
