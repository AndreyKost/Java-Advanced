import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[R][];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        String tokens[] = scanner.nextLine().split(" ");
        int num = matrix[Integer.parseInt(tokens[0])][Integer.parseInt(tokens[1])];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> queue2=new ArrayDeque<>();
        ArrayDeque<Integer> values=new ArrayDeque<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == num) {
                    queue.offer(row);
                    queue.offer(col);
                    queue2.offer(row);
                    queue2.offer(col);
                }
            }
        }

        System.out.println();

        while (queue.size() > 0) {
            int sum = 0;
            int row = queue.poll();
            int col = queue.poll();
            sum = Calc1(matrix, row, col, num);
            values.offer(sum);
        }

        while (queue2.size()>0){
            int row=queue2.poll();
            int col=queue2.poll();
            int value=values.poll();
            matrix[row][col]=value;
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%d ", matrix[row][col]);
            }
            System.out.println();
        }


    }

    private static int Calc1(int[][] matrix, int row, int col, int num) {
        int sum = 0;
        int r = row;
        int c = col;

        if (c > 0) {
            c--;
            if (matrix[r][c] != num) {
                sum += matrix[r][c];
            }
        }
        r = row;
        c = col;
        if (c < matrix[0].length - 1) {
            c++;
            if (matrix[r][c] != num) {
                sum += matrix[r][c];
            }
        }
        r = row;
        c = col;
        if (r > 0) {
            r--;
            if (matrix[r][c] != num) {
                sum += matrix[r][c];
            }
        }
        r = row;
        c = col;
        if (r < matrix.length - 1) {
            r++;
            if (matrix[r][c] != num) {
                sum += matrix[r][c];
            }
        }

        return sum;
    }
}
