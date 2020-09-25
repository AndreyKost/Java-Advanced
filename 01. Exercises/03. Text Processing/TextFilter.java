import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] banWords=scanner.nextLine().split(", ");
        String someText=scanner.nextLine();

        for (int i = 0; i <banWords.length ; i++) {
            while (someText.contains(banWords[i])){
                String newWord=repeats(banWords[i],banWords[i].length());
                someText=someText.replace(banWords[i],newWord);
            }
        }
        System.out.println(someText);

    }

    private static String repeats(String banWord, int length) {
        String newWord="";
        for (int i = 0; i <length ; i++) {
            newWord+="*";
        }
        return newWord;
    }
}
