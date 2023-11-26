import java.util.Scanner;

public class CountingPrimeDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");

        int number = sc.nextInt();


        int count = countPrimeDigits(number);

        System.out.println("Number of prime digits in the entered number is " + count);

    
}
  public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimeDigits(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (isPrime(digit)) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

	}


