import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] words=scanner.nextLine().split(" ");
        String newWord="";

        for (int i = 0; i <words.length ; i++) {
            newWord+=concat(words[i],words[i].length());
        }
        System.out.println(newWord);

    }

    private static String concat(String word, int length) {
        String newWord="";
        for (int i = 0; i <length ; i++) {
            newWord+=word;
        }
        return newWord;
    }
}
