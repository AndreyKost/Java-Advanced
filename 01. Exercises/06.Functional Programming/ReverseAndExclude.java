import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        int n=Integer.parseInt(scanner.nextLine());
        Collections.reverse(numbers);
        Predicate<Integer> filt= e-> e%n!=0;
        numbers.stream().filter(e->filt.test(e)).forEach(entry -> System.out.print(entry+" "));


    }
}
