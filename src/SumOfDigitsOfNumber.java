import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");

        int num = sc.nextInt();

        int sum = 0;
        int tem = num;

        while (tem != 0) {
            sum += tem % 10;
            tem /= 10;
        }

        System.out.println("The sum of digits of the entered number is " + sum);

	}

}
