import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayExercise1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] array=IntStream.range(0,5).toArray();

        String command=scanner.nextLine();

        while(!command.equalsIgnoreCase("Stop")){
            int index=Integer.parseInt(command);

            System.out.println(array[index % array.length]);
            command=scanner.nextLine();
        }



    }
}
