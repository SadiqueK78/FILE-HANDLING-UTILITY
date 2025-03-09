import java.io.*;
import java.util.*;

public class FileOperations {

    public static void writeToFile(String fileName, String text) {
        try (FileWriter fw = new FileWriter(fileName, true); 
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(text);
            System.out.println("Text written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file!");
        }
    }

    public static void readFile(String fileName) {
        try (FileReader fr = new FileReader(fileName); 
             BufferedReader br = new BufferedReader(fr)) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }
    }

    public static void modifyFile(String fileName, String newText) {
        try (FileWriter fw = new FileWriter(fileName); 
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(newText);
            System.out.println("File modified successfully!");
        } catch (IOException e) {
            System.out.println("Error modifying file!");
        }
    }

    public static void modifyStringInFile(String fileName, String oldString, String newString) {
        try {
            File file = new File(fileName);
            List<String> fileContent = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.add(line.replace(oldString, newString));
            }
            reader.close();

            FileWriter writer = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(writer);
            for (String content : fileContent) {
                printWriter.println(content);
            }
            printWriter.close();
            System.out.println("String modification complete!");
        } catch (IOException e) {
            System.out.println("Error modifying string in file!");
        }
    }

    public static void deleteLineFromFile(String fileName, String lineToDelete) {
        try {
            File file = new File(fileName);
            List<String> fileContent = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.equals(lineToDelete)) {
                    fileContent.add(line);
                }
            }
            reader.close();

            FileWriter writer = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(writer);
            for (String content : fileContent) {
                printWriter.println(content);
            }
            printWriter.close();
            System.out.println("Line deletion complete!");
        } catch (IOException e) {
            System.out.println("Error deleting line from file!");
        }
    }
}
