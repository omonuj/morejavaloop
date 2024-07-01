import java.util.Scanner;
public class CollectNine {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	
	int sum = 0;
	int score = 0; 
	
	for (int count  = 1; count < 10; count++){
	System.out.print("Enter a score: " );
	score = scanner.nextInt();
	sum =+ score;
	}
	System.out.println("The sum of numbers are: "+sum);


	}
}