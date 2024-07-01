import java.util.Scanner;
public class EnglishHausa {

	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: " );
	int number = scanner.nextInt();

	System.out.println( number == 1 ? "English" : "Hausa" );

}
}
	
