package javaSelfMain;
import java.util.*;


public class EncapsulationStudy {
	
	
	
	static private String hname = "Private Name ";	
	static public String name ="Public Name ";	
	static String ipName = "";
	
	
	
	
	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Input Test Name - ");
		String ipName = scanObj.nextLine();
		name+=ipName;
		System.out.println(name);
		hname+=ipName;
		System.out.println(hname);
	}}


