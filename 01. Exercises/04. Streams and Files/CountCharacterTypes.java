import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {
        String inputPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources2\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath="C:\\Users\\akostadinov\\Documents\\SoftUni\\3.JavaAdvanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources2\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        int vowel=0;
        int consonant=0;
        int punctuation=0;

        try (BufferedReader in = new BufferedReader(new FileReader(inputPath));
        BufferedWriter out =new BufferedWriter(new FileWriter(outputPath))) {
            String line=in.readLine();

            while (line!=null){
                for (int i = 0; i <line.length() ; i++) {
                    char ch=line.charAt(i);
                    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                        vowel++;
                    } else if(ch=='!' || ch==',' || ch=='.' || ch=='?'){
                        punctuation++;
                    }
                    if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!=' ' && ch!='!' && ch!=',' && ch!='.' && ch!='?'){
                        consonant++;
                    }
                }
                line=in.readLine();
            }

            out.write("Vowels: "+vowel);
            out.newLine();
            out.write("Consonants: "+consonant);
            out.newLine();
            out.write("Punctuation: "+punctuation);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
