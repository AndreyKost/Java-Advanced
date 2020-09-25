import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] tokens= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        LinkedHashMap<Double, Integer> numbers=new LinkedHashMap<>();

        for (Double s : tokens) {
            if(!numbers.containsKey(s)){
                numbers.put(s, 1);
            } else {
                numbers.put(s,numbers.get(s)+1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }

       /* for (Double entry : numbers.keySet()) {
            System.out.printf("%.1f -> %d%n",entry,numbers.get(entry));
        }*/


    }
}
