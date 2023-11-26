import java.util.Scanner;

public class NaturalNumbers15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers to be generated:");
        int n = sc.nextInt();

        System.out.print("First " + n + " natural numbers are :");
        for (int i = 1; i <= n; i++) {
            System.out.print(" "+i);
        }

	}

}
