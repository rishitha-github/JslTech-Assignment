import java.util.Scanner;

public class Denomination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a four-digit number:");
        int num = sc.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("Please enter a valid four-digit number.");
            return;
        }

        int thousands = num / 1000;
        int hundreds = (num % 1000) / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;

        System.out.println(thousands + "*1000 = " + thousands * 1000);
        System.out.println(hundreds + "*100 = " + hundreds * 100);
        System.out.println(tens + "*10 = " + tens * 10);
        System.out.println(ones + "*1 = " + ones);

	}

}
