import java.util.Scanner;

public class Billing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	     System.out.println("enter the billing amount");
	     int amt = sc.nextInt();
	     if(amt>6000) {
	    	 int dis = amt * 10/100;
	    	 int net= amt - dis;
	    	 System.out.println("your net billing amount is "+net);
	     }
	     else {
	    	 System.out.println("your net billing amount is "+amt);
	     }
	}

}
