import java.util.Scanner;
public class StudentGrades {

	public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);


		int countA = 0;
       		int countB = 0;
        	int countC = 0;
        	int countD = 0;


		for (int i = 0; i < 5; i++) {
            	System.out.print("Enter student name: ");
            	String studentName = scanner.next();
            
           	 System.out.print("Enter grade for " + studentName + ": ");
           	 char grade = scanner.next().charAt(0);

		switch (grade) {
                case 'A':
                case 'a':
                    countA++;
                    break;
                case 'B':
                case 'b':
                    countB++;
                    break;
                case 'C':
                case 'c':
                    countC++;
                    break;
                case 'D':
                case 'd':
                    countD++;
                    break;
                default:
                    System.out.println("Invalid grade entered for " + studentName);
                    break;
            }
        }

				 System.out.println("\nGrade Summary:");
        	System.out.println("Number of A's: " + countA);
        	System.out.println("Number of B's: " + countB);
        	System.out.println("Number of C's: " + countC);
        	System.out.println("Number of D's: " + countD);

	}
}
        