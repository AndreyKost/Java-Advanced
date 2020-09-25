import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class VoinaNumberGame2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens1[]=scanner.nextLine().split(" ");
        String tokens2[]=scanner.nextLine().split(" ");
        LinkedHashSet<Integer> playerOne=new LinkedHashSet<>();
        LinkedHashSet<Integer> playerTwo=new LinkedHashSet<>();

        for (String s : tokens1) {
            playerOne.add(Integer.parseInt(s));
        }
        for (String s : tokens2) {
            playerTwo.add(Integer.parseInt(s));
        }


        for (int round = 0; round <50 ; round++) {
            if(playerOne.isEmpty() || playerTwo.isEmpty()){
                break;
            }

            Iterator<Integer> firstPlayerIterator=playerOne.iterator();
            Iterator<Integer> secondPlayerIterator=playerTwo.iterator();

            int firstPlayerValue=firstPlayerIterator.next();
            playerOne.remove(firstPlayerValue);
            int secondPlayerValue=secondPlayerIterator.next();
            playerTwo.remove(secondPlayerValue);

            if(firstPlayerValue >secondPlayerValue){
                playerOne.add(firstPlayerValue);
                playerOne.add(secondPlayerValue);
            } else if(secondPlayerValue> firstPlayerValue){
                playerTwo.add(firstPlayerValue);
                playerTwo.add(secondPlayerValue);
            } else {
                playerOne.add(firstPlayerValue);
                playerTwo.add(secondPlayerValue);
            }

        }


        if(playerOne.size() > playerTwo.size()){
            System.out.println("First player win!");
        } else if(playerTwo.size() > playerOne.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }



    }
}
