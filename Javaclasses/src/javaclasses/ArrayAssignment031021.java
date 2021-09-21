package javaclasses;

public class ArrayAssignment031021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create three 1D Arrays - Name , Email, Tel#
//		Print the each set of Data from them in one line
//		create one 2D array - for the above data - print the data - one row in one line each
//		Create one 2D array - user name & password
//		Check the given username & password - if verified display message - successfully logged in .
//
		String name[] = new String[5];
		name[0]	= "Anthony";
		name[1]	= "Derrick";
		name[2]	= "Tonia";
		name[3]	= "Bobby";
		name[4]	= "Wehlan";
//		
//				
		String  email[]=  {"anthony@hotmail.com","derrikck@gmail.com",
			"tonia123@yahoo.com","bobby123@hotmail.com","jesswehln@aol.com"};

//	Loop through an array with For-each
		System.out.println("Data from Arrays with out a counter variable!\r---------------------------------------------");
		for (String test:email) {
			System.out.println(test);
		}
		
		
		String phone[] = {"5161234561","5161234562","5161234563","5161234564","5161234565"};
		
		String combDtl[][] = {{"Anthony","anthony@hotmail.com","5161234561"},{ "Derrick","derrikck@gmail.com","5161234562"},
				{"Tonia","tonia123@yahoo.com","5161234563"},{ "Bobby","bobby123@hotmail.com","5161234564"},
				{ "Wehlan","jesswehln@aol.com","5161234565"}};
	
////		Print the each set of Data from them in one line 
	boolean ln = true;
		for (int i=0;i<name.length;i++) {
			
			if (ln) {
			System.out.println("\r\rData from Individual Arrays");
			System.out.println("Name" + "\t\t"+ "Email"+"\t\t\t"+ "Phone" + "\r--------------------------------------------------");	
			ln = false;
			}
			
			System.out.println(name[i] + "\t\t"+email[i]+"\t"+phone[i]);
			}
	
		System.out.println();
		System.out.println("Data from Combined (Single) Array");
		System.out.println("Name" + "\t\t"+ "Email"+"\t\t\t\t"+ "Phone" + "\r----------------------------------------------------------");	
		for (int i2=0;i2<combDtl.length;i2++) {
						
			for (int j2=0;j2<combDtl[i2].length;j2++) {
			System.out.print(combDtl[i2][j2] + "\t\t");
			}
			System.out.println();
		}
		
		
//		Create one 2D array - user name & password
//		Check the given username & password - if verified display message - successfully logged in .
		
		System.out.println("\r\rChecking the given data for a match from an Array ! \r...................................................");
		
		String login[][] = {{"Anthony","anthony@hotmail.com","pw51&^61"},{ "Derrick","derrikck@gmail.com","5161pwd$#2"},
				{"Tonia","tonia123@yahoo.com","Str^%$4563"},{ "Bobby","bobby123@hotmail.com","Click4564"},
				{ "Wehlan","jesswehln@aol.com","Succ()234565"}};
		
		String username = "derrikck@gmail.com";
		String pword    = "5161pwd$#2";
		
		for (int cl1=0;cl1<login.length;++cl1) {
				
				if (username.equals(login[cl1][1]) && pword.equals(login[cl1][2])) {
					System.out.println("Welcome  " + login[cl1][0] + " ! \rYou are Successfully Logged In !!!");
					break;
				}
				else if (cl1==login.length-1) {
						System.out.println("Your User Name or Password is not matching.\rIf not registerd please register first\rOr Key in Correct User Name & Password !");
					}
				}
		
			
		}
			

	}	
	

