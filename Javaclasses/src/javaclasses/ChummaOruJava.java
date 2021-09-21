package javaclasses;
//import java.util.ArrayList;
import java.util.*;
public class ChummaOruJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
StringBuilder sb = new StringBuilder();
StringBuffer sbf = new StringBuffer("New String Buffer for Study.");
//System.out.println(sb.capacity());
//System.out.println(sbf.capacity());

//sb.append("Test Append Builder");
//sbf.append(" "+"Test Append Buffer ");
//
//sbf.insert(3, " Inserted");
//sbf.delete(4, 13);
//System.out.println(sbf);
//System.out.println(sbf.getClass());

//String [][] test2 = {{"r0","c0","h0"},{"r01","c01","h01"},{"r02","c02","h02"},{"r03","c03","h03"}};
//
//int i = 1;
//int j = 2;
//
//System.out.println(test2[i][j]);

ArrayList <String> tal1=new ArrayList <String>();
ArrayList <String> wrkg=new ArrayList <String>();
tal1.add("ca");
tal1.add("ca510");
tal1.add("ca32");
tal1.add("ca3");
tal1.add("ca1");
tal1.add("ca5");
tal1.add("ca");
tal1.add("ca");
tal1.add("ca");
tal1.add("ca32");
tal1.add("ca5");
tal1.add("ca510");
tal1.add("ca510");
tal1.add("ca51");
tal1.add("ca610");
tal1.add("ca610");
tal1.add("ca3");
tal1.add("ca3");
tal1.add("ca1");
tal1.add("ca510");
//System.out.println(tal1);

for (String i:tal1) {
	//System.out.println(i);
	wrkg.add(i);
}

//Collections.sort(tal1);
Collections.sort(wrkg);
//wrkg.add("Filler null");
System.out.println(tal1);

HashMap <String, Integer> hmArray = new HashMap();

int count=1;
String inl = wrkg.get(0);
for (int k=1;k<wrkg.size();k++) {
	
	if (wrkg.get(k)==inl) {
		count++;
	}
	else {
		hmArray.put(inl, count);
		inl = wrkg.get(k);
		count=1;
	}
	
}

hmArray.put(inl, count);
System.out.println(hmArray);

	}}

