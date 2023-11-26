import java.util.Scanner;

public class Incrementing5digit49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int originalNumber = sc.nextInt();

        if (isFiveDigitNumber(originalNumber)) {
            int incrementedNumber = incrementDigits(originalNumber);
            System.out.println("Input: " + originalNumber);
            System.out.println("Output: " + incrementedNumber);
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }
    }

    public static boolean isFiveDigitNumber(int number) {
        return number >= 10000 && number <= 99999;
    }

    public static int incrementDigits(int number) {
        int[] digits = new int[5];

        for (int i = 4; i >= 0; i--) {
            digits[i] = (number % 10 + 1) % 10;
            number /= 10;
        }

        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }

        return result;

	}

}
