import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayExercise2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] multiArray=new int[Integer.parseInt(scanner.nextLine())][];
        Random random=new Random();
        for (int row = 0; row <multiArray.length ; row++) {
            int start=Math.abs(random.nextInt());
            multiArray[row]= IntStream.range(start, start+row+1).toArray();

        }

        System.out.println();

    }
}
