import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(" ");
        int R=Integer.parseInt(tokens[0]);
        int C=Integer.parseInt(tokens[1]);
        int[][] matrix=new int[R][C];

        for (int row = 0; row <R ; row++) {
            String appendTokens[]=scanner.nextLine().split(" ");
            for (int col = 0; col <C ; col++) {
                matrix[row][col]=Integer.parseInt(appendTokens[col]);
            }
        }

        int max=Integer.MIN_VALUE;
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        for (int row = 0; row <R ; row++) {
            for (int col = 0; col <C ; col++) {
                if((row-1>=0 && col-1>=0) && (row+1<=matrix.length-1 && col+1<=matrix[0].length-1)){
                    queue.offer(row);
                    queue.offer(col);
                }
            }
        }


        int sum=0;
        int[][] mtrx=new int[3][3];
        ArrayDeque<Integer> queue2=new ArrayDeque<>();
        while (queue.size()>0){
            int row=queue.poll();
            int col=queue.poll();
            sum=matrix[row][col]+matrix[row-1][col-1]+matrix[row][col-1]+matrix[row-1][col]+matrix[row-1][col+1]+matrix[row][col+1]
                    +matrix[row+1][col-1]+matrix[row+1][col]+matrix[row+1][col+1];
            if(sum>max){
                queue2.clear();
                max=sum;
                queue2.offer(matrix[row-1][col-1]);
                queue2.offer(matrix[row-1][col]);
                queue2.offer(matrix[row-1][col+1]);
                queue2.offer(matrix[row][col-1]);
                queue2.offer(matrix[row][col]);
                queue2.offer(matrix[row][col+1]);
                queue2.offer(matrix[row+1][col-1]);
                queue2.offer(matrix[row+1][col]);
                queue2.offer(matrix[row+1][col+1]);
            }
        }

        for (int row = 0; row <3 ; row++) {
            for (int col = 0; col <3; col++) {
                mtrx[row][col]=queue2.poll();
            }
        }
        System.out.println("Sum = "+max);
        for (int row = 0; row <3 ; row++) {
            for (int col = 0; col <3 ; col++) {
                System.out.printf("%d ",mtrx[row][col]);
            }
            System.out.println();
        }







    }
}
