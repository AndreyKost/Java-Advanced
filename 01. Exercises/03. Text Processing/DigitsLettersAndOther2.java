import java.util.Scanner;

public class DigitsLettersAndOther2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        StringBuilder digits=new StringBuilder();
        StringBuilder letters=new StringBuilder();
        StringBuilder other=new StringBuilder();

        for (int i = 0; i <line.length() ; i++) {
            if(Character.isDigit(line.charAt(i))){
                digits.append(line.charAt(i));
            } else if(Character.isAlphabetic(line.charAt(i))){
                letters.append(line.charAt(i));
            } else {
                other.append(line.charAt(i));
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);

    }
}
