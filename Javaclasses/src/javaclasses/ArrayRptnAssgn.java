package javaclasses;
import java.util.*;
public class ArrayRptnAssgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList <String> al1 = new ArrayList<String>(); // original array list
		
		al1.add("Test121"); 	al1.add("Test1");	al1.add("Test1");		al1.add("Test19");
		al1.add("Test1");		al1.add("Test2");	al1.add("Test1"); 		al1.add("Test2");
		al1.add("Test2"); 		al1.add("Test12");	al1.add("Test13"); 		al1.add("Test14");
		al1.add("Test1");		al1.add("Test25");	al1.add("Test25");		al1.add("Test25");
		al1.add("Test27");		al1.add("Test19");	al1.add("Test12"); 		al1.add("Test1");
		al1.add("Test13"); 		al1.add("Test1");	al1.add("Test14"); 		al1.add("Test1");
		al1.add("Test1"); 		al1.add("Test15");	al1.add("Test1"); 		al1.add("Test16");
		al1.add("Test1");		al1.add("Test17");	al1.add("Test1");		al1.add("Test18");
				
		HashMap<String,Integer> hm = new HashMap();
		
		for (int i=0;i<al1.size();i++) {
			
			if ((hm.get(al1.get(i))) != null) {
				hm.put(al1.get(i), hm.get(al1.get(i))+1);			
			}
			else {
				hm.put(al1.get(i), 1);
			}
		}
		
		System.out.println("All Entries and it's frequencies \r................................\r" + hm);
		
		// Only to get the duplicated entries
		
		Iterator <String> it = hm.keySet().iterator();
		
		System.out.println("\rEntries \t Frequency\r..........................");
		while (it.hasNext()) {
			String keyword = it.next();
			if(hm.get(keyword)>1) {
				System.out.println(keyword +"\t\t"+hm.get(keyword));
			}
		}
				
	}}

