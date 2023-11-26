import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 'n' to calculate the series sum:");
        int n = sc.nextInt();
        float sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum+ 1/ i;
        }

        System.out.println("Sum of the series 1 + 1/2 + 1/3 + ... + 1/n is: " + sum);

	}

}
