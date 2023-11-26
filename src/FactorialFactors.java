
public class FactorialFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7; // Number of terms
        double sum = 0;
        double factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; // Calculate factorial for each term
            sum += i / factorial; // Add the term to the sum
        }

        System.out.println("The sum of the first 7 terms of the series is: " + sum);
	}

}
