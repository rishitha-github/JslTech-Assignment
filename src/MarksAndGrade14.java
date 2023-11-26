import java.util.Scanner;

public class MarksAndGrade14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks scored in 1st subject:");
        int s1 = sc.nextInt();

        System.out.println("Enter the marks scored in 2nd subject:");
        int s2 = sc.nextInt();

        System.out.println("Enter the marks scored in 3rd subject:");
        int s3 = sc.nextInt();

        int totalMarks = s1 + s2 + s3;
        float average = totalMarks / 3;

        String grade =" ";

        if (average < 35) {
            grade = "C";
        }
        else if (average >= 35 && average <= 60) {
            grade = "B";
        }
        else {
            grade = "A";
        }

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average is: " + average);
        System.out.println("Grade: \"" + grade + "\"");

	}

}
