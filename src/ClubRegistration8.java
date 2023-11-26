import java.util.Scanner;

public class ClubRegistration8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the name:");
	        String name = sc.nextLine();

	        System.out.println("Enter the mobile number:");
	        long mobNum = sc.nextLong();

	        System.out.println("Enter the age:");
	        int age = sc.nextInt();

	      
	        if (age >= 18) {
	         
	            System.out.println("Congratulations " + name + " for your successful registration.");
	        }
	        else {
	           
	            System.out.println("Sorry! You need to be at least 18 years old to get membership.");
	            return;
	}

}
	}
