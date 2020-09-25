import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class GetFolderSize {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String path="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        File root=new File(path);

        Deque<File> dirs=new ArrayDeque<>();
        dirs.offer(root);
        int sum=0;

        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFile = current.listFiles();
            if (nestedFile != null){
                for (File file : nestedFile) {
                    if (file.isDirectory()) {
                        dirs.offer(file);
                    } else {
                        sum += file.length();
                    }
                }
        }
            }


        System.out.println("Folder size: "+sum);


    }
}
