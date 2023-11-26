import java.util.Scanner;

public class GettingSingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");

        int num= sc.nextInt();
        while (num > 9) {
            int temp = num;
            int currentSum = 0;

            // Calculate the sum of digits
            while (temp != 0) {
                currentSum += temp % 10;
                temp /= 10;
            }

            num = currentSum;


    }

        System.out.println("Single digit sum is: " + num);

	}

}
