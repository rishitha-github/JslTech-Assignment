import java.util.Scanner;

public class PrimeNumbersBEtweenNumbers18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lower bound value:");
        int lowerBound = sc.nextInt();
        
        System.out.println("Enter the upper bound value:");
        int upperBound = sc.nextInt();

        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(" " + num);
            }
        }

    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
   


	}

}
