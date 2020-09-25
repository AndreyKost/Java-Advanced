import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String normalText=scanner.nextLine();
        StringBuilder encryptedText=new StringBuilder();

        for (int i = 0; i <normalText.length() ; i++) {
            int symbol=normalText.charAt(i)+3;
            char c=(char)symbol;
            encryptedText.append(c);
        }
        System.out.println(encryptedText);

    }
}
