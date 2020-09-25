import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens1[]=scanner.nextLine().split(" ");
        int R1=Integer.parseInt(tokens1[0]);
        int C1=Integer.parseInt(tokens1[1]);
        int[][] matrix1=new int[R1][C1];
        for (int row = 0; row <R1 ; row++) {
            String tokens[]=scanner.nextLine().split(" ");
            for (int col = 0; col <C1 ; col++) {
                matrix1[row][col]=Integer.parseInt(tokens[col]);
            }
        }

        String tokens2[]=scanner.nextLine().split(" ");
        int R2=Integer.parseInt(tokens2[0]);
        int C2=Integer.parseInt(tokens2[1]);
        int[][] matrix2=new int[R2][C2];
        for (int row = 0; row <R2 ; row++) {
            String tokens[]=scanner.nextLine().split(" ");
            for (int col = 0; col <C2 ; col++) {
                matrix2[row][col]=Integer.parseInt(tokens[col]);
            }
        }

        if(compareMatrix(matrix1, matrix2)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean compareMatrix(int[][] matrix1, int[][] matrix2) {
        if((matrix1.length!=matrix2.length) || (matrix1[0].length!=matrix2[0].length)){
            return false;
        }

        for (int row = 0; row <matrix1.length ; row++) {
            for (int col = 0; col <matrix1[0].length ; col++) {
                if(matrix1[row][col]!=matrix2[row][col]){
                    return false;
                }
            }
        }

        return true;
    }
}
