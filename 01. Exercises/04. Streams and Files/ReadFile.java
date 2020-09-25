import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String path="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        try (FileInputStream fileStream = new FileInputStream(path)) {
         int oneByte=fileStream.read();
         ArrayList<String> binariesWords=new ArrayList<>();
         while (oneByte>=0){
             String strBin=Integer.toBinaryString(oneByte);
             binariesWords.add(strBin);
             oneByte=fileStream.read();
         }
            System.out.print(String.join(" ",binariesWords));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
