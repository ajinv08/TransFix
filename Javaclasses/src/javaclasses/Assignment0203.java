package javaclasses;

public class Assignment0203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assignment Date 02.03.21:
		// 1. calculation - area of some shape, conversion of dollar to euros, celsius to farenheit
		// 2. get the output = actual ouput
		// 3. create a variable for output = expected output
		// 4. compare actual vs expected output (negative and positive way)

		double radius= 8d;
		double pi = 22/7d;
		double a_circle = (22 * radius*radius)/7 ; 
		System.out.println("Area of the Circle (Expcted Output) - " + a_circle );
		System.out.println("Area of the Circle (Actual Output) - " + pi*radius*radius);
		System.out.print("Expected n Acutal Output are same ? ") ;
		System.out.println(a_circle == pi*radius*radius);
		System.out.println();
		
		double usd2euro = 1.20d;
		double usd  = 4.56d;
		double euro = usd/usd2euro;
		System.out.println("USD to Euro (Expected Output) - $" +usd + " = Euro " + euro);
		System.out.println("USD to Euro (Actual Output)   - $" +usd + " = Euro " + usd/usd2euro);
		System.out.print("Expected n Acutal Output are same ? ") ;
		System.out.println(euro == usd/usd2euro);		
	}

}
