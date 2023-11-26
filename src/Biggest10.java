import java.util.Scanner;

public class Biggest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1:");
        int num1 = sc.nextInt();
        System.out.println("Enter a number2:");
        int num2 = sc.nextInt();
        
        if(num1>num2) {
        	int big = num1;
        	System.out.println("The bigger of the two numbers (20 and 45) is "+big);
        }
        else {
        	System.out.println("The bigger of the two numbers (20 and 45) is "+num2);
        }


	}

}
