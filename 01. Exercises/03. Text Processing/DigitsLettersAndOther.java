import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();

        for (int i = 0; i <line.length() ; i++) {
            if(Character.isDigit(line.charAt(i))){
                System.out.printf("%s",line.charAt(i));
            }
        }
        System.out.println();
        for (int i = 0; i <line.length() ; i++) {
            if(!Character.isDigit(line.charAt(i))){
             if((line.charAt(i)>=65 && line.charAt(i)<=90) || (line.charAt(i)>=97 && line.charAt(i)<=122)){
                 System.out.printf("%s",line.charAt(i));
             }
            }
        }
        System.out.println();
        for (int i = 0; i <line.length() ; i++) {
            if(!Character.isDigit(line.charAt(i))){
                if((line.charAt(i)>=65 && line.charAt(i)<=90) || (line.charAt(i)>=97 && line.charAt(i)<=122)){

                } else {
                    System.out.printf("%s",line.charAt(i));
                }
            }
        }



    }
}
