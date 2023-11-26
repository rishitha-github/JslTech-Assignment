import java.util.Scanner;

public class SumOfOddSeries23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 'n' to calculate the series sum:");
        int n = sc.nextInt();
        int sum =0;
        for (int i=1;i<=n;i=i+2) {
        	sum = sum +i;
        }
        System.out.println("Sum1 of the series is "+sum);
	}

}
