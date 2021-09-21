package javaclasses;

import java.util.*;
public class MethodsAsgnmntInventory033121 {

	/* How an Inventory & Other Files updated 
	 * in a sales /purchase environment
	 */
	
	/* Files - Product Master, Price, Purchase, Sales, Inventory
	 * 
	 */
	
	/* Functions - 
	 * Product Master (Data Structure) 
	 * sKU - String
	 * name - String
	 * alternative1- String (cross Reference purpose)
	 *
	 * brandName - String
	 * Price - Double
	 * 
	 *  
	 *  when a new item is introduced, it get added and when it
	 * is obsolete it is getting deleted. Various Fields such as are added 
	 */
	
	// Lets create Product Master File - ArrayList
	
	
	
	static String salesSKU[];
	static double salesQtyPrice[][];
	
	static String pMaster1 [][] = {{"000001","Name11","Alt11","Brand11",},{"000002","Name12","Alt12","Brand12"},
							{"000003","Name13","Alt13","Brand13"}, {"0000014","Name14","Alt14","Brand14"},
							{"0000015","Name15","Alt15","Brand15"},{"0000016","Name16","Alt16","Brand16"}};
	static double pMaster2[][] = {{25,0.12},{35,1.50},{40,2.32},{50,3.43},{60,4.53},{100,5.45}}; // Qty & Price
	
	static String purchSKU[] = {"000001","0000016","0000014"};
	static double purchQtyPrice[][] = {{20,3.00},{40,8.00},{50,6.00}};
	
	static void purchase() {
		double curr_stk_amt = 0.00;
		double purch_amt = 0.00;
		for (int i=0; i< purchSKU.length;i++) {
			
			for (int k =0; k<pMaster1.length;k++) {
			 if (purchSKU[i].equals(pMaster1[k][0])){
				 curr_stk_amt =	(purchQtyPrice[i][0]*purchQtyPrice[i][1]);
				 
				 pMaster2[k][1]= ((purchQtyPrice[i][0]*purchQtyPrice[i][1])+ (pMaster2[k][0]*pMaster2[k][1]))/(purchQtyPrice[i][0]+pMaster2[k][0]);
				 pMaster2[k][0]= pMaster2[k][0]+purchQtyPrice[i][0]; 
			break;	 
			 }
			}
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		purchase();
		
		System.out.println(pMaster1[0][1] + " "+ pMaster2[0][0] + " "+pMaster2[0][1]);
		
		
		
	}


	private static MethodsAsgnmntInventory033121 MethodsAsgnmntInventory033121() {
		// TODO Auto-generated method stub
		return null;
	}}
