import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int r=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());
        String[][] A=new String[r][c];
        String[][] B=new String[r][c];
        String[][] C=new String[r][c];

        for (int row = 0; row <A.length ; row++) {
            String tokens[]=scanner.nextLine().split(" ");
            for (int col = 0; col <A[0].length ; col++) {
                A[row][col]=tokens[col];
            }
        }
        for (int row = 0; row <B.length ; row++) {
            String tokens[]=scanner.nextLine().split(" ");
            for (int col = 0; col <B[0].length ; col++) {
                B[row][col]=tokens[col];
            }
        }

        for (int row = 0; row <A.length ; row++) {
            for (int col = 0; col <A[0].length ; col++) {
                if(A[row][col].equals(B[row][col])){
                    C[row][col]=A[row][col];
                }
                else {
                    C[row][col]="*";
                }
            }
        }

        for (int row = 0; row <C.length ; row++) {
            for (int col = 0; col <C[0].length ; col++) {
                System.out.printf("%s ",C[row][col]);
            }
            System.out.println();
        }


    }
}
