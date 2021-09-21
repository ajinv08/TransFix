package javaSelfMain;

public class AccessModifiersSubClass extends AccessModifiers {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//TestDefault testObj = new TestDefault();
	TestDefault.def_class_var += " Test Access in sub Class with out instance or object ";
	System.out.println(TestDefault.def_class_var);
	System.out.println("This Variable is accessed as this class in inherited from other class " + testPublicVar);

	TestFinal finClassObj = new TestFinal(); 
	finClassObj.final_Var +="Final Class Inherited from AccessModifier";
	System.out.println(finClassObj.final_Var);
}}
