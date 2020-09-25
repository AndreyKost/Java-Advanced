import java.util.Scanner;

public class RepeatString {

    static String printString(String word,int repeat){
        String[] str=new String[1];
        str[0]=word;
        String input="";

        for (int i = 0; i <repeat ; i++) {
            input=input+str[0];
        }
        return input;

        /*String result="";
        for (int i = 0; i <repeat ; i++) {
            result+=word;
        }

        return result;*/

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        int repeat=Integer.parseInt(scanner.nextLine());
        String sentence=printString(word,repeat);
        System.out.println(sentence);


    }
}
