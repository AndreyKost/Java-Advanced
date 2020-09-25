import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(" ");
        int R=Integer.parseInt(tokens[0]);
        int C=Integer.parseInt(tokens[1]);
        String[][] matrix=new String[R][C];

        int count=0;
        char first='a';
        char second;
        char third='a';
        for (int row = 0; row <R; row++) {
            int n=first+count;
            char f=(char)n;
            char t=(char)n;
            count++;
            int num=0;
            for (int col = 0; col <C ; col++) {
                num=97+row+col;
                second=(char)num;
                String str="";
                str=str+""+f+second+t;
                matrix[row][col]=str;
            }
        }

        for (int row = 0; row <R ; row++) {
            for (int col = 0; col <C ; col++) {
                System.out.printf("%s ",matrix[row][col]);
            }
            System.out.println();
        }


    }
}
