import java.util.*;
import java.util.stream.Collectors;

public class CustomComparator2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer f, Integer s) {
                int result=0;

                if(f%2==0 && s%2!=0){
                    result=-1;
                } else if(f%2!=0 && s%2==0){
                    result=1;
                } else {
                    result=f -s;
                }

                return result;
            }
        };
        numbers.sort(comparator);
        numbers.forEach(e -> System.out.print(e+" "));
    }
}
