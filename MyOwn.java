import java.util.Scanner;
public class MyOwn {

	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	String multiLineString = """
	Welcome to online banking!!!
	1.To make transfer.
	2.To buy airtime.
	3.To buy data.
	4.To share data.
	5.To go back.
	6.Invalid input.
                """;

	System.out.print(multiLineString);

	System.out.print("Enter a digit to get started: ");
	int digit = scanner.nextInt();
	
	switch (digit) {
	case 1:
	System.out.print("To make transfer");
		break;
	case 2:
	System.out.print("To buy airtime");
		break;
	case 3:
	System.out.print("To buy data");
		break;
	case 4:
	System.out.print("To share data");
		break;
	case 5:
	System.out.print("To go back");
		break;
	default:
	System.out.print("invalid input");

	}
}
}
