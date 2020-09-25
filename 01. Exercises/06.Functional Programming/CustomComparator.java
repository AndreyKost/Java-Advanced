import java.util.*;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> numbers1=new ArrayList<>();
        List<Integer> numbers2=new ArrayList<>();
        numbers1=numbers.stream().filter(e->e%2==0).sorted(Comparator.naturalOrder())
                .collect(Collectors.toCollection(ArrayList::new));
        numbers1.stream().forEach(e-> System.out.print(e+" "));
        numbers2=numbers.stream().filter(e->e%2!=0).sorted(Comparator.naturalOrder()).collect(Collectors.toCollection(ArrayList::new));
        numbers2.stream().forEach(e-> System.out.print(e+" "));


    }
}
