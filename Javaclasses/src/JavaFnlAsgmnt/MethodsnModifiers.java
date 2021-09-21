package JavaFnlAsgmnt;

import java.util.*;
public class MethodsnModifiers {

//instance variable. to be called through object
	String test = "Testing the Instance Varaible";
	
// Class variable. Directly called
	static String test2 = "Testing the Class Varaible";
	
//declaring a static variable invArray - 2d Array
	
	 static String invArray[][]= {{"Item1","100","10.25"},{"Item2","120","20.25"},{"Item3","140","10.75"},{"Item4","150","40.50"},{"Item5","200","50.99"},{"Item6","160","18.35"}};
	

// declare 3 ArrayLists - public variables to keep the data from the above Array and access freely.
	
	static ArrayList <String> productSKU = new <String> ArrayList();
	static ArrayList <Integer> quantity = new <Integer> ArrayList();
	static ArrayList <Float> price = new <Float> ArrayList();
	
	
// Constructor to split the data from the array and add to respective array lists
	public MethodsnModifiers() {	
												
					for (int k=0;k<invArray.length;k++) {
						productSKU.add(invArray[k][0]);
						quantity.add(Integer.parseInt(invArray[k][1]));
						price.add(Float.parseFloat(invArray[k][2]));
		}}
		
// Sales Value key in Process. Products Sold, Qty & Price Sold. User keys in and Respective Array Lists are Updated.
	
	static ArrayList <String> saleSKU = new <String> ArrayList();
	static ArrayList <Integer> saleQty = new <Integer> ArrayList();
	static ArrayList <Float> salePrice = new <Float> ArrayList();
	
	static String sSKU ="";
	static int sQty=0;
	static float sPrice=0f;
	static boolean status = true;
	
 public static void saleInput() {
		Scanner scanSKU = new Scanner(System.in);
		Scanner scanQty = new Scanner(System.in);
		Scanner scanPrice = new Scanner(System.in);
		Scanner scanStatus = new Scanner(System.in);
		
		while (status) {
			System.out.println("Do you have more data to Key in (true / false) ? " + status);
			System.out.println();
			status = scanStatus.nextBoolean();
			if (status) {
				
				System.out.println("SKU Sold - " + sSKU );
				System.out.println("\n");
			    sSKU = scanSKU.nextLine();
			    
			    System.out.println("Qty Sold - " + sQty);
			    System.out.println("\n");
			    sQty = scanQty.nextInt();
			    
			    System.out.println("Price Sold - " +sPrice );
			    System.out.println("\n");
			    sPrice = scanPrice.nextFloat();
			    
			   saleSKU.add(sSKU);
			   saleQty.add(sQty);
			   salePrice.add(sPrice);
			   
			}
					
		}
		scanStatus.close();
		scanPrice.close();
		scanQty.close();
		scanSKU.close();
		disptheInputs();
		
		}
		
//Method to display the inputs from the Array List appended
static void disptheInputs() {
	System.out.println(saleSKU);
	System.out.println(saleQty);
	System.out.println(salePrice);
}
 
	// method to input the Sales Values directly
 String dirSKU = "";
 int dirQty=0;
 float dirPrice=0f;
 public String salDirInput(String dirSKU, int dirQty, float dirPrice) {
	 String salDirStat ="True";
	 	saleSKU.add(dirSKU);
	   saleQty.add(dirQty);
	   salePrice.add(dirPrice);
	 return salDirStat;
 }
	
	
	
// method to display the data in the array list using iterator
		
		public static void dispArrayList() {
			Iterator <String> it1 = productSKU.iterator();
			Iterator <Integer> it2 = quantity.iterator();
			Iterator <Float> it3 = price.iterator();
			while (it1.hasNext()&&it2.hasNext()&&it3.hasNext()){
				System.out.println(it1.next()+ " " +it2.next()+ " "+it3.next());
				
			}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsnModifiers arrayobj = new MethodsnModifiers();
		//System.out.println(arrayobj.test); // instance variable is called
		//System.out.println(test2);           // static variable is called
		dispArrayList();                    // static method of displaying from various Array List is called
		
		
		arrayobj.saleInput();                // non static Sales Data In Put Method through scanner
		
		arrayobj.salDirInput("Item32", 20, 30.50f); // non static method with return and parameters
		disptheInputs();                            // to display the inputs from the Array List appended  
		
	}

}
