import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnaryOperator<Double> addvat = x -> x * 1.2;
        List<Double> vats= Arrays.stream(scanner.nextLine().split(", "))
                .map(s -> Double.parseDouble(s))
                .map(d -> addvat.apply(d))
                .collect(Collectors.toList());

        System.out.println("Prices with VAT:");
        vats.stream().forEach(e-> System.out.printf("%.2f%n",e));

    }
}
