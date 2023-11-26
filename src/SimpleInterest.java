import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	     System.out.println("enter principle amount");
	     int p = sc.nextInt();
	     System.out.println("enter a rate of interest");
	     float r = sc.nextFloat();
	     System.out.println("enter a time(years)");
	     int t = sc.nextInt();
	     
	     float x = p*t*r ;
	     float si = x/100;
	     System.out.println("Simple Interest is "+si);
	}

}
