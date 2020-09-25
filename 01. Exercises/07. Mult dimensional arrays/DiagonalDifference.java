import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=Integer.parseInt(scanner.nextLine());
        int[][] matrix=new int[size][size];
        for (int row = 0; row <size ; row++) {
            String tokens[]=scanner.nextLine().split(" ");
            for (int col = 0; col <size ; col++) {
                matrix[row][col]=Integer.parseInt(tokens[col]);
            }
        }

        int sum1=0;
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix.length ; col++) {
                if(row==col){
                    sum1+=matrix[row][col];
                }
            }
        }

        int sum2=0;
        int col=0;
        for (int row =matrix.length-1; row >=0 ; row--) {
         sum2+=matrix[row][col];
         col++;
        }

        int difference=Math.abs(sum1-sum2);
        System.out.println(difference);


    }
}
