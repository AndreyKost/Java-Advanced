import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        TreeMap<Character, Integer> alphabet=new TreeMap<>();

        for (int i = 0; i <line.length() ; i++) {
            char ch=line.charAt(i);
            if(alphabet.containsKey(ch)){
                alphabet.put(ch,alphabet.get(ch)+1);
            } else {
                alphabet.put(ch,1);
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : alphabet.entrySet()) {
            System.out.printf("%c: %d time/s%n",characterIntegerEntry.getKey(),characterIntegerEntry.getValue());
        }


    }
}
