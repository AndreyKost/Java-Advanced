import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedHashMap<String, Integer> minertask=new LinkedHashMap<>();

        String line=scanner.nextLine();
        while (!line.equals("stop")){
            int n=Integer.parseInt(scanner.nextLine());
            if(minertask.containsKey(line)){
                minertask.put(line,minertask.get(line)+n);
            } else {
                minertask.put(line,n);
            }

            line=scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : minertask.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}
