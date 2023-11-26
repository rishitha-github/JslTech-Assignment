import java.util.Scanner;

public class PositiveResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the  num1:");
	        int num1 = sc.nextInt();

	        System.out.println("Enter the second number num2:");
	        int num2 = sc.nextInt();
	        
	        int result=0;

	        if (num1 > num2) {
	            result = num1 - num2;
	        } 
	        else {
	            result = num2 - num1;
	        }

	        System.out.println("The result (difference) is: " +result);

	}

}
