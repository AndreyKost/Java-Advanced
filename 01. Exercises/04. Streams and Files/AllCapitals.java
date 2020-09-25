import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        String inputPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources2\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources2\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";


        try (BufferedReader in = new BufferedReader(new FileReader(inputPath));
             BufferedWriter out=new BufferedWriter(new FileWriter(outputPath))) {
            String line=in.readLine();

            while (line!=null){
                String str=line.toUpperCase();
                out.write(str);
                out.newLine();

                line=in.readLine();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
