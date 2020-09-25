import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numbers[]= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        System.out.println(findMinElement.apply(numbers));


    }

    private static Function<int[], Integer> findMinElement=new Function<int[], Integer>() {
     public Integer apply(int[] array){
         List<Integer> num=new ArrayList<>();
         int min=Integer.MAX_VALUE;
         for (int i : array) {
             num.add(i);
         }
         return Collections.min(num);
     }

    };

}

