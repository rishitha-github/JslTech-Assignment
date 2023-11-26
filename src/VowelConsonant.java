import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        switch (Character.toLowerCase(inputChar)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(inputChar + " is a vowel.");
                break;
            default:
                System.out.println(inputChar + " is a consonant.");
                break;
        }

	}

}
