package javaSelfMain;
import java.util.*;
class TestAgain{
	String name = "";
	
TestAgain(String name){
	this.name=name;
	
}
	
void ConfmMethod() {
	System.out.println("School Name : " + name);
	//System.out.println("No of Students : " + student);
}
	
 String inputMethod() {
	String a ="";
	Scanner scanobj = new Scanner(System.in);
	System.out.println("Enter School Name " + a);
	a=scanobj.nextLine();
	scanobj.close();
	return a;
}
 
 
}

public class Aji_Contr_Method_Var_Study2 extends AjiExp_Constr_Var_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TestAgain test1 = new TestAgain(null);
			test1.name =test1.inputMethod();
			test1.ConfmMethod();
			AjiExp_Constr_Var_Method inheritObj = new AjiExp_Constr_Var_Method();
			
	}

}
