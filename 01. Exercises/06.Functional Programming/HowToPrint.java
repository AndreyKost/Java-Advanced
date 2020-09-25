import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class HowToPrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers=new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers.toString());
        Consumer<List<Integer>> print= list ->{
            String str=list.toString();
            System.out.println(str.substring(1,str.length()-1));
        };

        Consumer<List<Integer>> print1=list -> {
            System.out.println(list.stream()
                    .map(e -> Integer.toString(e))
                    .collect(Collectors.joining(", ")));

        };

        print.accept(numbers);
        print1.accept(numbers);


    }
}
