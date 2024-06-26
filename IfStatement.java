import java.util.Scanner;
public class IfStatement {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("userinput: ");
	int userinput = scanner.nextInt();

	if (userinput < 50){
	System.out.println("D");
	}
	else
	if (userinput >= 50 && userinput <= 69){
	System.out.println("Your grade is: C");
	}
	else
	if (userinput >= 70 && userinput <= 89){
	System.out.println("Your grade is: B");
	}
	else
	if (userinput >= 90 && userinput <= 100){
	System.out.println("Your grade is: A");
	}
	
	}
}