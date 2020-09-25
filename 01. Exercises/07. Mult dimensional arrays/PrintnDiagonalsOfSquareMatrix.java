import java.util.ArrayList;
import java.util.Scanner;

public class PrintnDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());
        int[][] matrix=new int[N][N];

        for (int row = 0; row <matrix.length ; row++) {
            String tokens[]=scanner.nextLine().split(" ");
            for (int col = 0; col <matrix[0].length ; col++) {
                matrix[row][col]=Integer.parseInt(tokens[col]);
            }
        }

        ArrayList<Integer> diagonal1=new ArrayList();
        ArrayList<Integer> diagonal2=new ArrayList();

        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix[0].length ; col++) {
                if(row==col){
                    diagonal1.add(matrix[row][col]);
                }
            }
        }

        int col=0;
        for (int row =matrix.length-1; row >=0 ; row--) {
            diagonal2.add(matrix[row][col]);
            col++;
        }

        for (Integer d1 : diagonal1) {
            System.out.printf("%d ",d1);
        }
        System.out.println();
        for (Integer d2 : diagonal2) {
            System.out.printf("%d ",d2);
        }

    }
}
