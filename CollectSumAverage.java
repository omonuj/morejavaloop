import java.util.Scanner;
public class CollectSumAverage {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter score1: ");
	 int score1 = scanner.nextInt();

	System.out.print("Enter score2: ");
	 int score2 = scanner.nextInt();

	System.out.print("Enter score3: ");
	 int score3 = scanner.nextInt();

	System.out.print("Enter score4: ");
	 int score4 = scanner.nextInt();

	System.out.print("Enter score5: ");
	 int score5 = scanner.nextInt();

	System.out.print("Enter score6: ");
	 int score6 = scanner.nextInt();

	System.out.print("Enter score7: ");
	 int score7 = scanner.nextInt();

	System.out.print("Enter score8: ");
	 int score8 = scanner.nextInt();

	System.out.print("Enter score9: ");
	 int score9 = scanner.nextInt();

	System.out.print("Enter score10: ");
	 int score10 = scanner.nextInt();
		
	int sum = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;
	int average = sum / 10;

	System.out.println("the sum is: "+sum+" and average is: "+average);

	}
}