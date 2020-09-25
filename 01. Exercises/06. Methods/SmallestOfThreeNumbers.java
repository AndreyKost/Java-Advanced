import java.util.Scanner;

public class SmallestOfThreeNumbers {

    static void printSmallestOfThreeIntegers(int a, int b, int c) {
        int min = Math.min(a, b);
        int min2 = Math.min(min, c);
        System.out.println(min2);


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        printSmallestOfThreeIntegers(a, b, c);

    }
}
