package oOPSConcept;

public class Child2Class extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2Class cc2=new Child2Class();
		GrParentMethod(); 
		cc2.b+=100001;
		System.out.println("Accessing non static variable from Parent Class -" + cc2.b);
	}

}
