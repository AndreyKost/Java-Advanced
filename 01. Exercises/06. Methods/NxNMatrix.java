import java.util.Scanner;

public class NxNMatrix {

    static void printMatrix(int n){
        int[][] Matrix=new int[n][n];

        for (int i = 0; i <Matrix.length ; i++) {
            for (int j = 0; j <Matrix.length ; j++) {
                Matrix[i][j]=n;
            }
        }

        for (int i = 0; i <Matrix.length ; i++) {
            for (int j = 0; j <Matrix[i].length ; j++) {
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printMatrix(n);

    }
}
