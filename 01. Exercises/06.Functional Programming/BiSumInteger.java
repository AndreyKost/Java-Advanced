import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class BiSumInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BiFunction<Integer,Integer,Integer> add= (x,y) -> x+y;
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(", "))
                .map(x->Integer.parseInt(x))
                .collect(Collectors.toList());

        System.out.println("BiSum="+numbers.stream().reduce(0,(x,y)->x+y));

    }
}
