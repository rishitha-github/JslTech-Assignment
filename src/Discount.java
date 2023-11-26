import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount:");
        int amt = sc.nextInt();
         System.out.println("Do you have a membership card? (Y/N)");
        char hasMembershipCard = sc.next().charAt(0);
        float discount =0;;
        float net=0;

        if (hasMembershipCard == 'Y' || hasMembershipCard == 'y') {
            
            discount = (float) (0.10 * amt);
            
        }
        else {
            
            discount = (float) (0.03 * amt);
        }
        net = amt- discount;
        System.out.println("Thank you! Your total bill amount is Rs "+amt+
        		", discount is Rs "+ discount+" and net amount payable is Rs "+net);
	}

}
