import java.util.Scanner;

public class EmployeeSalary3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	     System.out.println("enter empno");
	     int num = sc.nextInt();
	     System.out.println("enter employee name");
	     String name = sc.next();
	     System.out.println("enter monthly salary");
	     int salary = sc.nextInt();
	      
	     int yearlysalary = salary* 12;
	     System.out.println("Hi "+name+"! Your employee id is "+num+",monthly salary is Rs "+salary+
	    		 "and yearly salary is Rs "+yearlysalary);
	}

}
