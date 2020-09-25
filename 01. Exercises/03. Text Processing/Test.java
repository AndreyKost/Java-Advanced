import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] tokens=scanner.nextLine().split(" ");
        List<Integer> numbers=new ArrayList<>();
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token));
        }

        System.out.println(numbers.get(0));


    }
}
