import java.util.*;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(" ");
        int rows=Integer.parseInt(tokens[0]);
        int cols=Integer.parseInt(tokens[1]);

        int[][] matrix=new int[rows][cols];

        for (int r = 0; r <rows ; r++) {
            matrix[r]= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int row=rows-1;
        int col=cols-1;

        while (row>=0){
            int r=row;
            int c=col;

            while (c<cols && r>=0) {

                System.out.print(matrix[r--][c++]+" ");
            }
            System.out.println();
            col--;

            if(col==-1){
                col=0;
                row--;
            }

        }


    }
}
