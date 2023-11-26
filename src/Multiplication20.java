import java.util.Scanner;

public class Multiplication20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to generate its multiplication table:");
        int num = sc.nextInt();

        System.out.println("Multiplication20 table for " + num + " is :");

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }

	}

}
