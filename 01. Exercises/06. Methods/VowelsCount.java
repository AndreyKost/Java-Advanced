import java.util.Scanner;

public class VowelsCount {

    static void printVowelsCount(String word){

        int count=0;
        for (int i = 0; i <word.length(); i++) {
            //int ascii=(int)word.charAt(i);
            if(word.charAt(i)==65 || word.charAt(i)==69 || word.charAt(i)==73 ||
                    word.charAt(i)==79 || word.charAt(i)==85 || word.charAt(i)==89
            || word.charAt(i)==97 || word.charAt(i)==101 || word.charAt(i)==105 ||
                    word.charAt(i)==111 || word.charAt(i)==117 || word.charAt(i)==121){
                count++;
            }
        }

        System.out.println(count);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        printVowelsCount(word);

    }
}
