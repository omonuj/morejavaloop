
import java.util.Scanner;

public class MenuNavigationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exitProgram = false;

        while (!exitProgram) {
            System.out.println("Main Menu:");
            System.out.println("1. File");
            System.out.println("2. Edit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int mainChoice = scanner.nextInt();
 
            switch (mainChoice) {
                case 1: // File menu
                    boolean backToMainFile = false;
                    while (!backToMainFile) {
                        System.out.println("File Menu:");
                        System.out.println("1. New");
                        System.out.println("2. Open");
                        System.out.println("3. Save");
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        int fileChoice = scanner.nextInt();

                        switch (fileChoice) {
                            case 1:
                                System.out.println("You selected File -> New");
                                break;
                            case 2:
                                System.out.println("You selected File -> Open");
                                break;
                            case 3:
                                System.out.println("You selected File -> Save");
                                break;
                            case 4:
                                backToMainFile = true;
                                break;
                            default:
                                System.out.println("Invalid choice in File menu.");
                                break;
                        }
                    }
                    break;

                case 2: // Edit menu
                    boolean backToMainEdit = false;
                    while (!backToMainEdit) {
                        System.out.println("Edit Menu:");
                        System.out.println("1. Cut");
                        System.out.println("2. Copy");
                        System.out.println("3. Paste");
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        int editChoice = scanner.nextInt();

                        switch (editChoice) {
                            case 1:
                                System.out.println("You selected Edit -> Cut");
                                break;
                            case 2:
                                System.out.println("You selected Edit -> Copy");
                                break;
                            case 3:
                                System.out.println("You selected Edit -> Paste");
                                break;
                            case 4:
                                backToMainEdit = true;
                                break;
                            default:
                                System.out.println("Invalid choice in Edit menu.");
                                break;
                        }
                    }
                    break;

                case 3: // Exit
                    exitProgram = true;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice in Main Menu.");
                    break;
            }
        }

        scanner.close();
    }
}