import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int res=1;
        for(int i =num;i>=1;i--) {
        	 res= res*i;
        	
        }
        System.out.println("The factorial of a number is "+res);
	}

}
