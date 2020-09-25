import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> usernames=new LinkedHashSet<>();


        while (n>0){
            String line=scanner.nextLine();
            usernames.add(line);


            n--;
        }

        for (String username : usernames) {
            System.out.println(username);
        }


    }
}
