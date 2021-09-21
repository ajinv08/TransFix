package javaclasses;

import java.util.*;
public class AssignmentArrayList031721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// How to identify the multiple occurrence of a value in an array list?
		// Count the number of occurrence of the value in an array list.
		// User name + password assignment in Array List (multiple array list)
		
		ArrayList <String> al1 = new ArrayList<String>(); // original array list
		
		al1.add("Test121");
		al1.add("Test1");
		al1.add("Test12");
		al1.add("Test1");
		al1.add("Test13");
		al1.add("Test1");
		al1.add("Test14");
		al1.add("Test1");
		al1.add("Test1");
		al1.add("Test15");
		al1.add("Test1");
		al1.add("Test16");
		al1.add("Test1");
		al1.add("Test17");
		al1.add("Test1");
		al1.add("Test18");
		al1.add("Test1");
		al1.add("Test19");
		al1.add("Test1");
		al1.add("Test2");
		al1.add("Test1");
		al1.add("Test2");
		al1.add("Test2");
		al1.add("Test12");
		al1.add("Test13");
		al1.add("Test14");
		al1.add("Test1");
		al1.add("Test25");
		al1.add("Test25");
		al1.add("Test25");
		al1.add("Test27");
		al1.add("Test19");
		
		ArrayList <String> ual = new ArrayList <String> (); // intermediate storing arraylist
		ArrayList <String> ual2 =new ArrayList <String> (); // final data storing arraylist
		ArrayList <Integer> cnt = new ArrayList <Integer>(); // count - number of repetition of individual data
	
		for (int i=0;i<al1.size();i++) {ual.add(i, al1.get(i));} // copied the data from original array list to the intermediate array list
		
		// below loop makes the repeated data in the intermediate array list as null
		
		for (int k1=0;k1<al1.size()-1; k1++) {
			for (int k2=k1+1; k2<ual.size(); k2++) {
				if (al1.get(k1).equals(ual.get(k2))) {
					ual.set(k2, null);
		}}}
		
		// below code checks non null data in intermediate array list with original list, and each and every 
		// time it finds the data repeated in the original array list, it countes and the count is stored in the variable counter
		
		for (int c=0;c<ual.size();c++) {
			int counter=0;
			for (int c2=0 ; c2<al1.size();c2++) {
				if ( ual.get(c)!= null && ual.get(c).equals(al1.get(c2))) {
					counter++;
				}
			
		// after each cycle (loop) of checking with original array list the non null data and its count get added to  
		// a final array list and array for counts
		
				if (counter >0 && c2==al1.size()-1) {
					ual2.add(ual.get(c));
					cnt.add(counter);
		}}}
		
		// Final Results are displayed.
		
		System.out.println("Final Results \rData\t\tCount\r------\t\t----- ");
		for (int j2=0;j2<ual2.size();j2++) {
		System.out.println(ual2.get(j2) + "\t\t" + cnt.get(j2));
					
		}
	}
	}
	
		