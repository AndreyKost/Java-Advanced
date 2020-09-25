import java.util.Scanner;

public class CharactersInRange {

    static void prinCharsInRange(char from, char to) {

        if (from < to) {
            char begin = ++from;

            for (char i = begin; i < to; i++) {
                System.out.printf("%c ", i);
            }
        } else {
            char begin = ++to;

            for (char i = begin; i < from; i++) {
                System.out.printf("%c ", i);
            }
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char from = scanner.nextLine().charAt(0);
        char to = scanner.nextLine().charAt(0);
        prinCharsInRange(from, to);


    }
}
