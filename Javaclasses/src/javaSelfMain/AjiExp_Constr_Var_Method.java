package javaSelfMain;



class School{
	// VARIABLES
	
 int teachersNo=0,studentsNo=0,classNo=0;
 String schoolName=""; 
 double g=0d;
 String inheritVariable = "Public Class Variable inherited";
 
  // CONTRUCTOR
 
 
 public School (String schoolName, int teachersNo, int studentsNo, int classNo) {
	 this.schoolName = schoolName;
	 this.teachersNo = teachersNo;
	 this.studentsNo = studentsNo;
	 this.classNo = classNo;
 }
   // METHOD 1
public void schoolGrade() {
	 System.out.println("School Name is  : - " + schoolName);
	 System.out.println("Number of Teachers : - " + teachersNo);
	 System.out.println("Number of Students : - " + studentsNo);
	 System.out.println("Number of Classes : - " + classNo);
	 g = (studentsNo / teachersNo) + (studentsNo/classNo);
	 System.out.println("Grade of the School - " + g+"\n");
	
 }
	
}

public class AjiExp_Constr_Var_Method {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		School covert = new School("Covert Avenue School",40,600,30);
		School clara = new School("Clara School",35,500,25);
		School dutch = new School("Dutch Broad Way School",50,650,32);
		School floral = new School("Floral Park Memorial School",60,600,30);

		covert.schoolGrade();
		clara.schoolGrade();
		dutch.schoolGrade();
		floral.schoolGrade();
		
		
	}

}
