package miscPkg;



public class StringtoValueViceVersa {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s1="100";
	String s2="90.75";
	int f1=0;
	f1=Integer.parseInt(s1);
	float f2=0.0f;
	f2=Float.parseFloat(s1);	
		System.out.println(f1+300);
		System.out.println((f2+300)/3);
	String s3 = Float.toString(f2);	
	System.out.println(s3);
	String s4 = String.valueOf(f1);
	System.out.println(s4);
		
	}}

	

