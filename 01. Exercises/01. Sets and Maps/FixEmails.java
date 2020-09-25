import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedHashMap<String, String> mails=new LinkedHashMap<>();

        String name=scanner.nextLine();
        while (!name.equals("stop")){
            String email=scanner.nextLine();
            String tokens[]=email.split("\\.");
            if(!tokens[1].equals("uk") && !tokens[1].equals("us") && !tokens[1].equals("com")){
                mails.put(name,email);
            }

            name=scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : mails.entrySet()) {
            System.out.printf("%s -> %s%n",entry.getKey(),entry.getValue());
        }


    }
}
