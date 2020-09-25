import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(", ");
        int size=Integer.parseInt(tokens[0]);
        int[][] matrix=new int[size][size];
        String method=tokens[1];
        if(method.equals("A")){
            MethodA(matrix);
        } else {
            MethodB(matrix);
        }

        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix.length ; col++) {
                System.out.printf("%d ",matrix[row][col]);
            }
            System.out.println();
        }

    }

    private static void MethodB(int[][] matrix) {
        int count=0;
        int isValid=1;
        for (int col = 0; col <matrix.length ; col++) {
            if(isValid%2==0){
                for (int row = matrix.length-1; row>=0 ; row--) {
                    count++;
                    matrix[row][col]=count;
                }
            } else {
                for (int row = 0; row <matrix.length ; row++) {
                    count++;
                    matrix[row][col]= count;
                }
            }
            isValid++;
        }
    }

    private static void MethodA(int[][] matrix) {
        int count=0;
        for (int col = 0; col <matrix.length ; col++) {
            for (int row = 0; row <matrix.length ; row++) {
                count++;
             matrix[row][col]=count;
            }
        }
    }
}
