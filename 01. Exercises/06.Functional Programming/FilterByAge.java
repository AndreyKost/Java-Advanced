import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String, Integer> workers=new LinkedHashMap<>();

        while (n>0){
            String tokens[]=scanner.nextLine().split(", ");
            String name=tokens[0];
            int age=Integer.parseInt(tokens[1]);
            workers.put(name,age);

            n--;
        }
        String condition=scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());
        String format=scanner.nextLine();

        PrintSortedAge(workers,condition,age,format);



    }

    private static void PrintSortedAge(Map<String, Integer> workers, String condition, int age, String format) {
        if(condition.equals("younger")){
            if(format.equals("name age")){
                workers.entrySet().stream().filter(e -> e.getValue()<=age)
                        .forEach(entry ->{
                            System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
                        });
            } else if(format.equals("age")){
                workers.entrySet().stream().filter(e -> e.getValue()<=age)
                        .forEach(entry ->{
                            System.out.println(entry.getValue());
                        });
            } else if(format.equals("name")){
                workers.entrySet().stream().filter(e -> e.getValue()<=age)
                        .forEach(entry ->{
                            System.out.println(entry.getKey());
                        });
            }
        } else {
            if(format.equals("name age")){
                workers.entrySet().stream().filter(e -> e.getValue()>=age)
                        .forEach(entry ->{
                            System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
                        });
            } else if(format.equals("age")){
                workers.entrySet().stream().filter(e -> e.getValue()>=age)
                        .forEach(entry ->{
                            System.out.println(entry.getValue());
                        });
            } else if(format.equals("name")){
                workers.entrySet().stream().filter(e -> e.getValue()>=age)
                        .forEach(entry ->{
                            System.out.println(entry.getKey());
                        });
            }

        }



    }
}
