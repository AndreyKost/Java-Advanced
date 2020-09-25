import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.function.Predicate;
        import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Predicate<String> isStartingWithUpper= s-> Character.isUpperCase(s.charAt(0));
        List<String> upperCaseStrings=Arrays.stream(scanner.nextLine().split(" "))
                .filter(s -> isStartingWithUpper.test(s))
                .collect(Collectors.toList());

        System.out.println(upperCaseStrings.size());
        upperCaseStrings.stream().forEach(e-> System.out.println(e));


    }
}
