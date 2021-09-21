package javaclasses;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] ar2d = new String [5][2]; // 5r X 2c - declared the empty array
		ar2d[0][0]="Test00R1C1";
		ar2d[0][1]="Test01R1C2";
		ar2d[1][0]="Test10R2C1";
		ar2d[1][1]="Test11R2C2";
		ar2d[2][0]="Test20R3C1";
		ar2d[2][1]="Test21R3C2";
		ar2d[3][0]="Test30R4C1";
		ar2d[3][1]="Test31R4C2";
		ar2d[4][0]="Test40R5C1";
		ar2d[4][1]="Test41R5C2";
		
		System.out.println("Number of Row    is :" + ar2d.length);
		System.out.println("Number of Column is :" + ar2d[1].length);

		
		String ar2direct[][] = {{"Dir1","Dic1"},{"Dir2","Dic2"},{"Dir3","Dic3"},{"Dir4","Dic4"},{"Dir5","Dic5"}};
		
		
		System.out.println("Name in 3rd Row+2nd Column is : " + ar2direct[2][1]);
		
		// Display all strings using loop
		
		for (int c=0; c<ar2d.length; c++) {
			
			for (int c2=0 ; c2<ar2d[c].length ; c2++) {
				
			System.out.println(" Position " + c + ","+ c2 + " is :" + ar2d[c][c2] );
			}
			
			System.out.println("\r ----------------");
		}
		
		
		
		
		
		
		
		
	}

}
