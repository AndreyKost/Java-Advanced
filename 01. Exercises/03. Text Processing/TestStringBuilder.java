import java.util.Scanner;

public class TestStringBuilder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        StringBuilder repeated=new StringBuilder();

        for (int i = 0; i <word.length() ; i++) {
            repeated.append(word);
        }

        String repeatedString=repeated.toString();
        System.out.println(repeated);

    }
}
