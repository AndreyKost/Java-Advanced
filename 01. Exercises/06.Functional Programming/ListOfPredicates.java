import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Set<Integer> numbers= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        Predicate<Integer> divisible=num -> {

            for (Integer number : numbers) {
                if(num%number!=0){
                    return false;
                }
            }

            return true;
        };
        Consumer<Integer> printer= e-> System.out.print(e+" ");

        for (int i = 1; i <=n ; i++) {
                if (divisible.test(i)) {
                    printer.accept(i);
                }
        }


    }
}
