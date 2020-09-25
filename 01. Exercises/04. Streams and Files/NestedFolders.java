import java.io.File;

public class NestedFolders {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Files-and-Streams");
        DFS(f);


    }

    static void DFS(File root){
        if(root==null) return;

        File[] files=root.listFiles();
        if(files==null) return;

        for (File file : files) {
            if(file.isDirectory()){
                System.out.println(file.getName());
                DFS(file);
            }
        }


    }
}
