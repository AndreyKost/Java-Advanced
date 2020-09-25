import java.util.Scanner;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();

        String[] tokens=line.split("\\s*,\\s*");

        for (String token : tokens) {
            if(isWinner(token)){

            }



        }


    }

    private static boolean isWinner(String token) {

    }
}
