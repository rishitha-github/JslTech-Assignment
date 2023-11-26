import java.util.Scanner;

public class BiggestOfThree13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	     System.out.println("enter a number1");
	     int num1 = sc.nextInt();
	     System.out.println("enter a number2");
	     int num2 = sc.nextInt();
	     System.out.println("enter a number3");
	     int num3 = sc.nextInt();
	      if(num1>num2 && num1>num3) {
	    	  System.out.println("Biggest10 of 3 numbers is "+num1);
	      }
	      else if(num2>num3 && num2>num1) {
	    	  System.out.println("Biggest10 of 3 numbers is "+num2);
	      }
	      else {
	    	  System.out.println("Biggest10 of 3 numbers is "+num3);
	      }
	}

}
