import java.io.*;

public class SumLines {
    public static void main(String[] args) {
        String inputPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources2\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(inputPath))) {
            String line=in.readLine();
            int sum=0;
            while (line!=null){
                for (int i = 0; i <line.length() ; i++) {
                    sum+=line.charAt(i);
                }
                line=in.readLine();

            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
