import java.util.Scanner;
public class Test {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	int number = 1;

	System.out.println("enter a number: ");	
	number = scanner.nextInt();
	{
	while (number <= 10)
	if (number % 2 == 0)
	System.out.println("this "+number+" is an even number");
	else
	System.out.println("this "+number+" is and odd number");
	number++;
	
	}
	}
}
