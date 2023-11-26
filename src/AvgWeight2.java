import java.util.Scanner;

public class AvgWeight2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	     System.out.println("enter a Weight1");
	     float w1 = sc.nextFloat();
	     System.out.println("enter a Weight2");
	     float w2 = sc.nextFloat();
	     System.out.println("enter a Weight3");
	     float w3 = sc.nextFloat();
	     
	     float totalwt = w1+w2+w3;
	      float avg = totalwt / 3;
	      System.out.println("Sum1 of weight of 3 persons is " +totalwt+"and the avg weight is "+avg);
	}

}
