package javaSelfMain;

// declare public default abstract final classes
// check the accessibility in sub class

class TestDefault{
	static String def_class_var ="Static Original in Default Class. ";
	String def_class_var_nonstic = "Non Static Original in Default Class. ";
}

final class TestFinal{
	String final_Var = " This is from AccessModifiers Class & Test Final Method - this method is final";
	
	}





public class AccessModifiers {
	static String testPublicVar="This variable declared in Public Class - AccessModifiers Class";

	protected static void pMethod(){
		System.out.println("pMethod for Checking the AcceeModifier Class Accessibility");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				TestDefault testObj = new TestDefault();
		TestDefault.def_class_var += " Test Access ";
		System.out.println(TestDefault.def_class_var);
		System.out.println(testPublicVar);
		TestFinal testFinalObj = new TestFinal();
		testFinalObj.final_Var +="Final Class Instance in Main Class";
		System.out.println(testFinalObj.final_Var);
		pMethod();
	}

}
