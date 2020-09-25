import java.io.*;

public class LineNumbers {
    public static void main(String[] args) {
        String inputPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources2\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String outputPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources2\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";


        try (BufferedReader in = new BufferedReader(new FileReader(inputPath));
        BufferedWriter out=new BufferedWriter(new FileWriter(outputPath))) {
            String line=in.readLine();
            int count=1;
            while (line!=null){
                out.write(count+". "+line);
                out.newLine();

                count++;
                line=in.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
