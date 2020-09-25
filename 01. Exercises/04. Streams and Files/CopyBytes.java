import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        String outputPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\03.CopyBytesOutput.txt";


        try (FileInputStream in = new FileInputStream(inputPath);
             FileOutputStream out=new FileOutputStream(outputPath)) {
            int oneByte=in.read();
            while (oneByte>=0){
                /*String str="";
                str=""+oneByte;*/
                String str= String.valueOf(oneByte);
                if(oneByte==32 || oneByte==10){
                out.write(oneByte);
                } else {
                    for (int i = 0; i <str.length() ; i++) {
                        out.write(str.charAt(i));
                    }
                }

                oneByte=in.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
