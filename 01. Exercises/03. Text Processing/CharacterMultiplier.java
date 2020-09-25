import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        String str1 = words[0];
        String str2 = words[1];
        boolean isBigger = false;
        int sum = 0;
        if (str1.length() >= str2.length()) {
            isBigger = true;
        }
        if (isBigger) {
            sum = sumOfChars(str1, str2);
        } else {
            sum = sumOfChars(str2, str1);
        }
        System.out.println(sum);
    }

    private static int sumOfChars(String str1, String str2) {
        int sum=0;
        int result=0;
        for (int i = 0; i <str1.length() ; i++) {
            if(i<str2.length()){
                result=str1.charAt(i)*str2.charAt(i);
                sum+=result;
            } else {
                result=(int)str1.charAt(i);
                sum+=result;
            }
        }
        return sum;
    }
}
