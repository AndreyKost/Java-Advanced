import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        String outputPath = "C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\05.WriteEveryThirdLineOutput.txt";
        int position=1;

        try (BufferedReader in = new BufferedReader(new FileReader(inputPath));
             BufferedWriter out=new BufferedWriter(new FileWriter(outputPath))) {
            String line=in.readLine();

            while (line!=null) {
            if(position%3==0){
                out.append(line).append(System.lineSeparator());
                /*out.write(line);
                out.newLine();*/
            }
            position++;
            line=in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
