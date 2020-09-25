import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> evenNumbers=Arrays.asList(scanner.nextLine().split(", "))
                .stream()
                .map(s -> Integer.parseInt(s))
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<String> toPrint=evenNumbers.stream()
                .map(s -> s.toString())
                .collect(Collectors.toList());

        String print=String.join(", ",toPrint);
        System.out.println(print);


        toPrint=evenNumbers.stream()
                .sorted()
                .map(s -> s.toString())
                .collect(Collectors.toList());

       print=String.join(", ",toPrint);
        System.out.println(print);

    }
}
