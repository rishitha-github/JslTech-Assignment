import java.util.Scanner;

public class FactorialWhile47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        long factorial = 1;
        while (number > 0) {
            factorial *= number;
            number--;
        }

        System.out.println("Factorial21 is: " + factorial);

	}

}
