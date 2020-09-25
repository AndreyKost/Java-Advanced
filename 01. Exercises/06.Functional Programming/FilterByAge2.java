import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> nameAgePairs = new LinkedHashMap<>();

        while (n > 0) {
            String tokens[] = scanner.nextLine().split(", ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            nameAgePairs.put(name, age);

            n--;
        }
        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> filter = getPredicate(condition, age);
        Consumer<Map.Entry<String, Integer>> printer = getPrinter(format);
        nameAgePairs.entrySet().stream()
                .filter(x -> filter.test(x.getValue()))
                .forEach(e -> printer.accept(e));


    }

    private static Consumer<Map.Entry<String, Integer>> getPrinter(String format) {
        Consumer<Map.Entry<String, Integer>> printer;
        if(format.equals("name")){
            printer= e-> System.out.println(e.getKey());
        } else if(format.equals("age")){
            printer=e -> System.out.println(e.getValue());
        }
        else {
            printer=e-> System.out.printf("%s - %d%n",e.getKey(),e.getValue());
        }

        return printer;
    }

    private static Predicate<Integer> getPredicate(String condition, int age) {
        Predicate<Integer> result;
        if (condition.equals("younger")) {
            result = n -> n <= age;
        } else {
            result = n -> n >= age;
        }
        return result;
    }
}
