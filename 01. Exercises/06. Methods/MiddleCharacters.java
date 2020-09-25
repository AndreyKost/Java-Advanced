import java.util.Scanner;

public class MiddleCharacters {

    static String getMiddleSymbols(String word){

        String result="";
        if (word.length()%2==0) {
            //System.out.printf("%c",word.charAt(word.length()/2));
            //System.out.printf("%c",word.charAt(word.length()/2 + 1));
            result=""+word.charAt(word.length()/2 - 1)+word.charAt(word.length()/2);
            return result;
        } else {
            //System.out.printf("%c",word.charAt(word.length()/2 + 1));
            result=""+word.charAt(word.length()/2);
            return result;
        }



    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        String result=getMiddleSymbols(word);
        System.out.println(result);


    }
}
