package javaclasses;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
public class HashMapHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();  // non-parameterized
		hm.put(12, "Value to the key 12");
		hm.put("a1", 100.23);
		
		HashMap <Integer, String> hm2 = new HashMap(); // parameterized
		hm2.put(1, "test1");
		hm2.put(2, "test2");
		hm2.put(3, "test3");
		hm2.put(4, "test4");
		hm2.put(5, "test5");
		hm2.put(6, "test6");
		
		Hashtable <Integer, String> ht2 = new Hashtable(); // parameterized
		ht2.put(1, "test1");
		ht2.put(2, "test2");
		ht2.put(3, "test3");
		ht2.put(4, "test4");
		ht2.put(5, "test5");
		
		System.out.println("entryset" +hm2.entrySet());
		System.out.println("Key Set" + hm2.keySet());
		System.out.println("Entry Set" + ht2.entrySet());
		System.out.println("KeySet" + ht2.keySet());
		System.out.println(hm.get("a1"));
		
		System.out.println(hm2.equals(ht2)); // Compares two objects
		
		System.out.println("Cheking presence " + ht2.containsKey(5));
		ht2.remove(5, "test"); // the given pair only will be removed
		System.out.println(ht2.entrySet());
		ht2.put(5, "New 5");
		// ht2.put(null, null); Error Not good to put both K V as null
		System.out.println("After inserting again to key 5" + ht2.entrySet());
		
		System.out.println("Cheking presence in Hashmap Value " + hm2.containsValue	("test5"));
		
		HashSet hs = new HashSet();
		hs.add("test1");
		hs.add("test12");
		hs.add("test13");
		hs.add("test14");
		hs.add("test15");
		System.out.println("HashSet" + hs);
		System.out.println(hs.contains("test1"));
	}

}