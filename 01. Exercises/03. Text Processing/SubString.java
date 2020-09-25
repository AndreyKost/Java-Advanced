import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String wordToRemove=scanner.nextLine();
        String wordFrom=scanner.nextLine();
        while (wordFrom.contains(wordToRemove)){
            wordFrom=wordFrom.replace(wordToRemove,"");
        }
        System.out.println(wordFrom);


    }
}
