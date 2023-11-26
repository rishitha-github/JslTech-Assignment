import java.util.Scanner;

public class Fibonacci19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int fib = a+b;
        while(fib<=n) {
        System.out.println("Fibonacci19 series upto entered number is "+fib);
       	 a=b;
       	 b=fib;
       	 fib=a+b;
        }
        
	}

}
