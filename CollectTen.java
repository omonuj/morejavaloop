import java.util.Scanner;
public class CollectTen {

	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	
	int sum = 0;
	int score = 0;
	int flagValue = -1; 
	
	while (flagValue != score){
	System.out.print("Enter a score or enter -1 to quit: " );
	score = scanner.nextInt();
	sum =+ score;
	}
		System.out.println("The sum of numbers are: "+sum);


	}
}