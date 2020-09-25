import java.util.Scanner;

public class Max2x2Submatrix {
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

        int[][] maxMatrix=new int[2][2];
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int row = 0; row <matrix.length-1 ; row++) {
            for (int col = 0; col <matrix[0].length-1 ; col++) {
                sum=0;
                sum=matrix[row][col]+matrix[row][col+1]+matrix[row+1][col]+matrix[row+1][col+1];
                if(sum>max){
                    max=sum;
                    maxMatrix[0][0]=matrix[row][col];
                    maxMatrix[0][1]=matrix[row][col+1];
                    maxMatrix[1][0]=matrix[row+1][col];
                    maxMatrix[1][1]=matrix[row+1][col+1];
                }
            }
        }
        for (int row = 0; row <maxMatrix.length ; row++) {
            for (int col = 0; col <maxMatrix[0].length ; col++) {
                System.out.printf("%d ",maxMatrix[row][col]);
            }
            System.out.println();
        }
        System.out.println(max);


    }
}
