package javaclasses;

public class VarMethdSttcRtnAsgmnt {

	/* Trying to make use of 
	 * Variable Types - Instance / Class / Local
	 * Method Types - Void & Return 
	 * Static Vs Non Static Properties of Variables & Methods
	 */
	
	// Instance Variable
	int inst_int = 0; 
	String inst_str = "New Instance Variable" ; 
	
	// Class Variables
	static int sttc_int = 0; 
	static String sttc_str = "New Class Variable";
	
	static String login[][] = {{"Anthony","anthony@hotmail.com","pw51&^61"},{ "Derrick","derrikck@gmail.com","5161pwd$#2"},
			{"Tonia","tonia123@yahoo.com","Str^%$4563"},{ "Bobby","bobby123@hotmail.com","Click4564"},
			{ "Wehlan","jesswehln@aol.com","Succ()234565"}};
	
	
	// Static Void Type Method
	static void log_s_msg() {
		System.out.println("\nLogin is Successful !!!");
	}
	
	static void log_f_msg() {
		System.out.println("\nLogin is Not Successful !!!");
	}
	
	
	// Statice Return Type Method
	static String log_test(String username,String pword) {
		
		String c="";
	for (int cl1=0;cl1<login.length;++cl1) {
		
		if (username.equals(login[cl1][1]) && pword.equals(login[cl1][2])) {
			c = "Welcome " + login[cl1][0]   + " !";
			log_s_msg();  // calling a static method
			break;
		}
		else if (cl1==login.length-1) {
			c = "Credentials Could Not Verified...";
			log_f_msg(); // calling a static method
		}
		}
	return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Executing the Log In Method !!! ");
		VarMethdSttcRtnAsgmnt obj = new VarMethdSttcRtnAsgmnt();
		String username = "anthony@hotmail.com";
		String pword    = "pw51&^61"; 
		String log_test_res = log_test(username,pword);
		System.out.println(log_test_res);
	
	System.out.println("\nCalling Instance & Class Variables\n----------------------------------\n ");
		System.out.println(obj.inst_str); // Intance Variable Accessed through object
		obj.inst_int=+100;
		System.out.println(obj.inst_int);

		System.out.println();
		sttc_int+=250;						// Class / Static Variable are called directly
		sttc_str+=". Can be called and used directly";
		System.out.println(sttc_str);
		System.out.println(sttc_int);
	}

}
