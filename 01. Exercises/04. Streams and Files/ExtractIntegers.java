import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        String outputPath = "C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04.ExtractIntegersOutput.txt";

        try (Scanner scanner = new Scanner(new FileReader(inputPath));
        PrintWriter writer=new PrintWriter(outputPath)) {
            while (scanner.hasNext()){
                scanner.next();
                if(scanner.hasNextInt()){
                    writer.println(scanner.nextInt());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


