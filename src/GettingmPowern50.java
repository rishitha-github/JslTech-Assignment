import java.util.Scanner;

public class GettingmPowern50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base (m): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();
        
        int result = 1;

        for (int i = 0; i < n; i++) {
            result *= m;
        }

        System.out.println(m + "^" + n + " = " + result);

	}

}
