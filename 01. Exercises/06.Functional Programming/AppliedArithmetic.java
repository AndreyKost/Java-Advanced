import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        String line=scanner.nextLine();
        Consumer<List<Integer>> print=arr -> arr.
                forEach(num -> System.out.print(num+" "));
        Function<List<Integer>, List<Integer>> increment=
                list -> list.stream()
                .map(e -> ++e)
                .collect(Collectors.toCollection(ArrayList::new));
        UnaryOperator<List<Integer>> multiply=
                list -> list.stream()
                .map( e -> e*=2)
                .collect(Collectors.toCollection(ArrayList::new));
        UnaryOperator<List<Integer>> subtract=
                list -> list.stream()
                .map(e -> --e)
                .collect(Collectors.toCollection(ArrayList::new));

        while (!line.equals("end")){
            switch (line){
                case "add":
                    numbers=increment.apply(numbers);
                    break;
                case "multiply":
                    numbers=multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers=subtract.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    System.out.println();
                    break;
            }

            line=scanner.nextLine();
        }

        System.out.println();


    }


}
