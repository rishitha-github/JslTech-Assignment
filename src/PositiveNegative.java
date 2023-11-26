import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	     System.out.println("enter a number");
	     int num = sc.nextInt();
	     if(num<0) {
	    	int pos = num - num - num;
	    	System.out.println("result is "+pos);
	    	
	    	 
	     }
	     else {
	    	 System.out.println(num);
	     }
	}

}
