import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        StringBuilder newWord=new StringBuilder();

        for (int i = 0; i <line.length()-1 ; i++) {
            if (line.charAt(i)!=line.charAt(i+1)){
                newWord.append(line.charAt(i));
            }
        }
        int length=line.length()-1;
        newWord.append(line.charAt(length));
        System.out.println(newWord);



    }
}
