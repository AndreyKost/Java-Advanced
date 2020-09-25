import java.io.*;
import java.util.Scanner;

public class MergeTwoFiles {
    public static void main(String[] args) {
        String firstPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources2\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputOne.txt";
        String secondPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources2\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputTwo.txt";
        String thirdPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources2\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\text.txt";


        try (BufferedReader in = new BufferedReader(new FileReader(firstPath));
        BufferedWriter out=new BufferedWriter(new FileWriter(thirdPath))) {
            String line=in.readLine();

            while (line!=null){
                out.write(line);
                out.newLine();

                line=in.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader in = new BufferedReader(new FileReader(secondPath));
             FileWriter out=new FileWriter(thirdPath,true)){

            String line=in.readLine();
            while (line!=null){
                out.write(line);
                out.write(System.lineSeparator());
                line=in.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
