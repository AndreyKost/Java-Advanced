import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<String, String> telephoneBook=new HashMap<>();

        String line=scanner.nextLine();
        while (!line.equals("search")){
            String tokens[]=line.split("-");
            String name=tokens[0];
            String number=tokens[1];
            telephoneBook.put(name,number);

            line=scanner.nextLine();
        }

        line=scanner.nextLine();
        boolean isValid=false;
        while (!line.equals("stop")){
            isValid=false;
            for (Map.Entry<String, String> entry : telephoneBook.entrySet()) {
                if(entry.getKey().equals(line)){
                    System.out.printf("%s -> %s%n",entry.getKey(),entry.getValue());
                    isValid=true;
                }
            }
            if(!isValid){
                System.out.printf("Contact %s does not exist.%n",line);
            }


            line=scanner.nextLine();
        }



    }
}
