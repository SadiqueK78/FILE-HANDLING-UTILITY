import java.util.Scanner;

public class FileMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "newfile.txt";
        int choice;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Write to file");
            System.out.println("2. Read from file");
            System.out.println("3. Modify file");
            System.out.println("4. Modify specific string in file");
            System.out.println("5. Delete line from file");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text to write to the file: ");
                    String textToWrite = scanner.nextLine();
                    FileOperations.writeToFile(fileName, textToWrite);
                    break;

                case 2:
                    FileOperations.readFile(fileName);
                    break;

                case 3:
                    System.out.print("Enter new content for the file: ");
                    String newText = scanner.nextLine();
                    FileOperations.modifyFile(fileName, newText);
                    break;

                case 4:
                    System.out.print("Enter the string to modify: ");
                    String oldString = scanner.nextLine();
                    System.out.print("Enter the new string: ");
                    String newString = scanner.nextLine();
                    FileOperations.modifyStringInFile(fileName, oldString, newString);
                    break;

                case 5:
                    System.out.print("Enter the line to delete: ");
                    String lineToDelete = scanner.nextLine();
                    FileOperations.deleteLineFromFile(fileName, lineToDelete);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
