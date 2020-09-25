import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String pathToRead="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        String pathToWrite="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\02.WriteToFileOutput.txt";


        try (FileInputStream in = new FileInputStream(pathToRead);
             FileOutputStream out = new FileOutputStream(pathToWrite)) {
            int oneByte=in.read();
            while (oneByte>=0){
                if(oneByte!=44 && oneByte!=46 && oneByte!=33 && oneByte!=63){
                    out.write(oneByte);
                }

                oneByte=in.read();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
