import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	     System.out.println("enter a number1");
	     int num1 = sc.nextInt();
	     System.out.println("enter a number2");
	     int num2 = sc.nextInt();
	     int temp=0;
	      
	     System.out.println("Before Swap,the values of num1 = "+num1+" and num2 = "+num2);
	     temp=num1;
	     num1=num2;
	     num2=temp;
	     System.out.println("After Swap,the values of num1 = "+num1+" and num2 = "+num2);
	     
	}

}
