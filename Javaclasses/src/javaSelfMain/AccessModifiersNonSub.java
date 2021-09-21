package javaSelfMain;

public class AccessModifiersNonSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestDefault testObj = new TestDefault();
		testObj.def_class_var += " Test Access in Non Sub ";
		System.out.println(testObj.def_class_var);
		//System.out.println(testObj.testPublicVar);
		
		TestFinal finClassObj = new TestFinal(); 
		finClassObj.final_Var +="Final Class Inherited from AccessModifier for non inherited";
		System.out.println(finClassObj.final_Var);
	}

}
