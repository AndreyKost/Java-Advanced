import java.util.Scanner;

public class MultiplicationSign {

    static void printSign(int a, int b, int c) {
        String result = "";
        int count = 0;

        if (a < 0) {
            ++count;
        }
        if (b < 0) {
            ++count;
        }
        if (c < 0) {
            ++count;
        }
        if (count == 1) {
            result = "negative";
        }
        if (count == 2) {
            result = "positive";
        }
        if (count == 3) {
            result = "negative";
        }
        if (a > 0 && b > 0 && c > 0) {
            result = "positive";
        }
        if (a == 0 || b == 0 || c == 0) {
            result = "zero";
        }

        System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        printSign(a, b, c);

    }
}
