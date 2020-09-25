import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensOrOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(" ");
        int lower=Integer.parseInt(tokens[0]);
        int upper=Integer.parseInt(tokens[1]);
        String condition=scanner.nextLine();
        Predicate<Integer> filter=getPredicate(condition);

        IntStream.range(lower,upper+1).filter(e -> filter.test(e)).forEach(entry -> System.out.print(entry+" "));



    }

    private static Predicate<Integer> getPredicate(String condition) {
        Predicate<Integer> result;
        if(condition.equals("odd")){
            result= x->x%2!=0;
        } else {
            result=x->x%2==0;
        }
        return result;
    }
}
