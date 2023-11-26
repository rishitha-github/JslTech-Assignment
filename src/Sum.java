import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner (System.in);
     System.out.println("enter a number1");
     int num1 = sc.nextInt();
     System.out.println("enter a number2");
     int num2 = sc.nextInt();
     
     int result= num1+num2;
     System.out.println( "sum of "+num1+"and"+num2+"is"+result);
     
	}

}
