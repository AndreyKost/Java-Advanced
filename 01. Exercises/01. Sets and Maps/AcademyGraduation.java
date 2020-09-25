import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        TreeMap<String, ArrayList<Double>> graduation=new TreeMap<>();


        while (n>0){
            String name=scanner.nextLine();
            String tokens[]=scanner.nextLine().split(" ");

            if(graduation.containsKey(name)){
                for (String token : tokens) {
                    graduation.get(name).add(Double.parseDouble(token));
                }
            } else {
                graduation.put(name, new ArrayList<>());
                for (String token : tokens) {
                    graduation.get(name).add(Double.parseDouble(token));
                }
            }
            n--;
        }


        DecimalFormat dec=new DecimalFormat("#.#############");
        double average=0;
        double sum=0;
        for (Map.Entry<String, ArrayList<Double>> entry : graduation.entrySet()) {
            sum=0;
            ArrayList<Double> std=entry.getValue();
            for (Double d : std) {
                sum+=d;
            }
            average=sum/std.size();
            entry.getValue().clear();
            entry.getValue().add(average);
        }

        for (Map.Entry<String, ArrayList<Double>> entry : graduation.entrySet()) {
            System.out.printf("%s is graduated with %s%n",entry.getKey(),entry.getValue().get(0));
        }


    }
}
