import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Integer>> hackers=new TreeMap<>();

        while (!(line.equals("end"))){
            String tokens[]=line.split(" ");
            String ips[]=tokens[0].split("=");
            //String messages[]=tokens[1].split("=");
            String users[]=tokens[2].split("=");

            String user=users[1];
            String IP=ips[1];

            if(hackers.containsKey(user)){
                if(hackers.get(user).containsKey(IP)){
                    int n=hackers.get(user).get(IP);
                    hackers.get(user).put(IP,n+1);
                } else {
                    hackers.get(user).put(IP,1);
                }
            } else {
                hackers.put(user, new LinkedHashMap<>());
                hackers.get(user).put(IP,1);
            }


            line=scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : hackers.entrySet()) {
            System.out.println(entry.getKey()+":");
            LinkedHashMap<String, Integer> asd=entry.getValue();
            int count=1;
            for (Map.Entry<String, Integer> integerEntry : asd.entrySet()) {
                if(entry.getValue().size()!=count){
                    System.out.printf("%s => %d, ",integerEntry.getKey(),integerEntry.getValue());
                } else {
                    System.out.printf("%s => %d.",integerEntry.getKey(),integerEntry.getValue());
                }
                count++;
            }
            System.out.println();
        }


    }
}
