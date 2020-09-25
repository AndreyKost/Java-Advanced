import java.io.File;

public class ListFiles {
    public static void main(String[] args) {

        File f=new File("C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Files-and-Streams");

        File[] allFiles=f.listFiles();
        for (File file : allFiles) {
            if(!file.isDirectory()) {
                System.out.printf("%s: [%s]%n", file.getName(), file.length());
            }
        }


    }
}
