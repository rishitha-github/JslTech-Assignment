import java.util.Scanner;

public class Calculator52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st Operand num1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the 2nd Operand num2: ");
        double num2 = scanner.nextDouble();

        System.out.println("1. add 2. mul 3. div 4. mod 5. sub");
        System.out.print("Enter the operator: ");
        int operator = scanner.nextInt();

        double result = 0;

        switch (operator) {
            case 1:
                result = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
                break;
            case 2:
                result = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is " + result);
                break;
            case 3:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The division of " + num1 + " by " + num2 + " is " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("The remainder of " + num1 + " divided by " + num2 + " is " + result);
                } else {
                    System.out.println("Cannot calculate modulus with zero divisor.");
                }
                break;
            case 5:
                result = num1 - num2;
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + result);
                break;
            default:
                System.out.println("Invalid operator entered.");
                break;
        }

	}

}
