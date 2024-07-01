import java.util.Scanner;
public class Jonah {

	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);
	int user = 0;
	int count = 1;
	while (count <= 2) {
	System.out.print("Enter a number: " );
	user = scanner.nextInt();

	if (user == 1) {
	System.out.println("To make transfer");
	}
	else if (user == 2) {
	System.out.println("To buy data");
	}
	else if (user == 3) {
	System.out.println("To can open an account");
	}
	else if (user == 4) {
	System.out.println("For insurance");
	}
	else if (user == 5) {
	System.out.println("To pay bills");
	}
	else {
	System.out.println("invalid");

	}
	count++;
	}
}
	
}





