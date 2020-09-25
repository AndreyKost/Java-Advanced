import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Predicate<Integer> filt= e -> e<=n;
        List<String> words= Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        words.stream().filter(e -> filt.test(e.length())).forEach(entry -> System.out.println(entry));



    }
}
