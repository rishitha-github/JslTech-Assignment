import java.util.Scanner;

public class NumberOfDigits41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");

        int num = sc.nextInt();

        int count = 0;
        int tem = num;

        while (tem != 0) {
            tem /= 10;
            count++;
        }

        System.out.println("The number of digits in the entered number is " + count);


}}
