import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensOrOdd2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(" ");
        int lower=Integer.parseInt(tokens[0]);
        int upper=Integer.parseInt(tokens[1]);
        String filter=scanner.nextLine();
        IntPredicate condition=null;
        if(filter.equals("odd")){
            condition=x -> x%2!=0;
        } else {
            condition=x-> x%2==0;
        }

        IntStream.range(lower,upper+1).filter(condition).forEach(entry -> System.out.printf("%d ",entry));



    }
}
