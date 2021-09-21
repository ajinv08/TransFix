package javaSelfMain;
import java.util.*;
import java.io.*;
public class ScannerExperi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum, secondNum, result;
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter a first number:");
	      firstNum = Integer.parseInt(scanner.nextLine());
	      System.out.println("Enter a second number:");
	      secondNum = Integer.parseInt(scanner.nextLine());
	      result = firstNum * secondNum;
	      System.out.println("The Result is: " + result);
	      scanner.close();
	}

}
