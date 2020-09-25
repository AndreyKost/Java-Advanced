import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFile2 {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        String path="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";

        FileInputStream in=null;
        try {
            in=new FileInputStream(path);
            int oneByte=in.read();
            while (oneByte>=0){
                String str=Integer.toBinaryString(oneByte);
                System.out.printf("%s ",str);
                oneByte=in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
