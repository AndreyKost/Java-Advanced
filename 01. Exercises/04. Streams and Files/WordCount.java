import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public static <tokens> void main(String[] args) {
        String firstPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources2\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\words.txt";
        String secondPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources2\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\text.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(firstPath));
             BufferedReader in2=new BufferedReader(new FileReader(secondPath))) {

            String word=in.readLine();
            Map<String, Integer> countNumbers=new LinkedHashMap<>();
            ArrayList<String> wordsFrom=new ArrayList<>();

            while (word!=null){
                String tokens[]=word.split(" ");
                for (String token : tokens) {
                    wordsFrom.add(token);
                }
                word=in.readLine();
            }

            for (String s : wordsFrom) {
                countNumbers.put(s,0);
            }

            String word2=in2.readLine();
            while (word2!=null){
                String tokens[]=word2.split(" ");
                for (String token : tokens) {
                    if(countNumbers.containsKey(token)){
                        int n=countNumbers.get(token);
                        countNumbers.put(token,n+1);
                    }
                }

                word2=in2.readLine();
            }

            for (Map.Entry<String, Integer> entry : countNumbers.entrySet()) {
                System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
