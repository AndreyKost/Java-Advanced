import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> userIp=new TreeMap<>();
        Map<String, Integer> userStats=new TreeMap<>();

        while (n>0){
            String tokens[]=scanner.nextLine().split(" ");
            String name=tokens[1];
            int points=Integer.parseInt(tokens[2]);
            String IP=tokens[0];

            if(userStats.containsKey(name)){
                int number=userStats.get(name);
                userStats.put(name,number+points);
            } else {
                userStats.put(name,points);
            }

            if(userIp.containsKey(name)){
                if(!userIp.get(name).contains(IP)){
                 userIp.get(name).add(IP);
                }
            } else {
                userIp.put(name, new ArrayList<>());
                userIp.get(name).add(IP);
            }


            n--;
        }


        userStats.entrySet().stream().sorted((f,s) -> {
            int result=f.getKey().compareTo(s.getKey());
            return result;
        }).forEach(e-> {
            System.out.printf("%s: %d ",e.getKey(),e.getValue());

            for (Map.Entry<String, List<String>> entry : userIp.entrySet()) {
                int count=1;
                if(entry.getKey().equals(e.getKey())){
                 List<String> asd=entry.getValue();
                 Collections.sort(asd);
                    /*for (int i = 0; i <asd.size() ; i++) {
                        if(asd.size()==1){
                            System.out.printf("[%s]",asd.get(i));
                        } else {
                            if(i==0){
                                System.out.printf("[%s, ",asd.get(i));
                            } else if(i==asd.size()-1){
                                System.out.printf("%s]%n",asd.get(i));
                            } else {
                                System.out.printf("%s, ",asd.get(i));
                            }
                        }
                    }*/
                    System.out.print("["+String.join(", ",asd)+"]");
                    System.out.println();
                }
            }
        });



    }
}
