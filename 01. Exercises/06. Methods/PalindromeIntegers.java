import java.util.Scanner;

public class PalindromeIntegers {

    static void printPalindrome(String number) {
        String reverse = "";

        for (int i = number.length() - 1; i >=0; i--) {
            reverse = reverse + number.charAt(i) + "";
        }
        if (reverse.equals(number)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while(!input.equals("END")){
            printPalindrome(input);
            input=scanner.nextLine();
        }


    }
}
