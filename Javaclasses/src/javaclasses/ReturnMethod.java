package javaclasses;

public class ReturnMethod {

	double totalBill(double price, double tax, double tip, int count) {
		double grpTotal = (price + price*tax/100 +tip)/count;
		return grpTotal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnMethod p = new ReturnMethod();
		
		double groupTotal= p.totalBill(200, 8, 20,5);
		
		System.out.println(p.totalBill(200, 8, 20,5));
		
		System.out.println(" Amount Per head is - " + groupTotal);
	}

}
