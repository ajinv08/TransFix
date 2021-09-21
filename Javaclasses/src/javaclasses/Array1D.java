package javaclasses;

public class Array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar1[]= new int[5]; // declaring new array
		ar1[0]=10;             // values are declared  
		ar1[1]=11;
		ar1[2]=12;
		ar1[3]=13;
		ar1[4]=14;
		
		System.out.println("Length of array ar1 :   " + ar1.length);
		System.out.println("At third Indexed Position ar1 : " + ar1[3]);
	
				
		int[] ar2 = {10,11,12,13,14}; // simple method to declare and input values
		System.out.println("Length of array ar2 :  " + ar2.length);
		System.out.println("At third Indexed Position ar2 : " + ar2[3]);
		
		System.out.println(ar1[1]+ar2[2]); // adding values
		
		// String Array
		
		String name[] = {"test1","test2","test3","test4"};
		
		System.out.println("on the first postion " + name[0]);
		
		name[0] = "new name ";
		
		for (int i = name.length-1;i>=0;i--) {
			System.out.println("Position  " + i + "  " + name[i]);
			
		}
		
		// comparing or checking values in array
		
		for (int i = name.length-1;i>=0;i--) {
			
			if (name[i].equalsIgnoreCase("test12")){
				System.out.println("Welcome") ;
			}
				else {
				System.out.println("Name not found");	
				}
								
			}
			
		AccessModifier amc = new AccessModifier();
		System.out.println(amc.a);
		amc.test1();
		
		}
		
		
	
	}


