import java.util.Scanner;

public class Armstrong44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");

        int num = sc.nextInt();

        int numberOfDigits = String.valueOf(num).length();

        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            int numpower = 1;
            for (int i = 0; i < numberOfDigits; i++) {
            	numpower *= digit;
            }

            sum += numpower;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong44 number.");
        } else {
            System.out.println(num + " is not an Armstrong44 number.");
        }

        
	}

}
