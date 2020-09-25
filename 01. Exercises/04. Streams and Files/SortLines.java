import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {
        Path inputPath= Paths.get("C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt");
        Path outputPath=Paths.get("C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\06.SortLinesOutput.txt");

        List<String> lines= Files.readAllLines(inputPath);
        Collections.sort(lines);
        Files.write(outputPath,lines);



    }
}
