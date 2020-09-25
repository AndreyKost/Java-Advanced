import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(", ");
        int[][] matrix=new int[Integer.parseInt(tokens[0])][Integer.parseInt(tokens[1])];

        for (int row = 0; row <matrix.length ; row++) {
            String appendTokens[]=scanner.nextLine().split(", ");
            for (int col = 0; col <matrix[0].length ; col++) {
                matrix[row][col]=Integer.parseInt(appendTokens[col]);
            }
        }
        int sum=0;

        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix[0].length ; col++) {
                sum+=matrix[row][col];
            }
        }

        System.out.println(tokens[0]);
        System.out.println(tokens[1]);
        System.out.println(sum);


    }
}
