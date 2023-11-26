
public class FactorialFactors54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7; 
        double sum = 0;
        double factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; 
            sum += i / factorial; 
        }

        System.out.println("The sum of the first 7 terms of the series is: " + sum);
	}

}
