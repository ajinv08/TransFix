package javaclasses;




public class Variables {
	// Types of Variable - Instance /Class /Local

	
	String instanceString; // Instance Varaible - outside any method but inside the class. It is nonstatic
	static String add; // Class Variable - outside any method, inside the class, static in nature
	
	static void test () {
		int a = 10;        // local variable -inside class & method, available in this method only
		boolean b;
	}
	
	public static void main(String[] args) 	{
		String Nam = "Aji's";
		int num2;
		num2=23;
		int _Num = 22, num3=23;
		float testf = 2.99f;
		double bum = 102.51d;
		char Fld = 'a';
	System.out.println(bum+ Nam + " " + Fld+ "  " + _Num);
	System.out.println(testf);
	System.out.println(num2+_Num);
	System.out.println(10/20);
//System.out.println("Test Success ag12?");
//System.out.println("Test Success ag13?");
//System.out.println("Test Success ag14?");
//System.out.println("Test Success ag14?");
//System.out.println("Test Success ag14?");
}

}
