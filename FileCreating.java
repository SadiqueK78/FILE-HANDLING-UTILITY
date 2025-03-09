import java.io.*;

public class FileCreating {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("newfile.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("THIS IS THE STARTING OF THE FILE");
            pw.println("THIS IS THE MIDDLE PART OF THE FILE");
            pw.print("THIS IS THE END OF THE FILE");
            pw.close();
            System.out.println("File created with initial content.");
        } catch (IOException e) {
            System.out.println("Error creating the file!");
        }
    }
}
