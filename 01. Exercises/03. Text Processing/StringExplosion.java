import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        StringBuilder newWord=new StringBuilder();

        for (int i = 0; i <word.length() ; i++) {
            char symbol=word.charAt(i);
            newWord.append(symbol);
            if(symbol=='>'){
                i++;
                int power=(word.charAt(i)-'0');
                int j=i;
                for ( ; j <i+power && j< word.length() ; j++) {
                    if(word.charAt(j)=='>'){
                        newWord.append('>');
                        power+=(word.charAt(j+1)-'0')+1;
                    }
                }
                i=j-1;
            }
        }

        System.out.println(newWord);



    }
}
