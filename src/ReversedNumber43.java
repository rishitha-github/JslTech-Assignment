import java.util.Scanner;

public class ReversedNumber43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");

        int num = sc.nextInt();

        int rev = 0;
        int tem = num;

        while (tem != 0) {
            int digit = tem % 10;
            rev = rev * 10 + digit;
            tem /= 10;
        }

        System.out.println("Reverse of the entered number is " + rev);

	}

}
