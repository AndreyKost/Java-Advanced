import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(" ");
        int R=Integer.parseInt(tokens[0]);
        int C=Integer.parseInt(tokens[1]);
        int[][] matrix=new int[R][C];
        for (int row = 0; row <matrix.length ; row++) {
            String inputTokens[]=scanner.nextLine().split(" ");
            for (int col = 0; col <matrix[0].length ; col++) {
                matrix[row][col]=Integer.parseInt(inputTokens[col]);
            }
        }
        int number=Integer.parseInt(scanner.nextLine());
        boolean isValid=false;
        for (int row = 0; row <R ; row++) {
            for (int col = 0; col <C ; col++) {
                if(matrix[row][col]==number){
                    System.out.printf("%d %d%n",row,col);
                    isValid=true;
                }
            }
        }

        if(!isValid){
            System.out.println("not found");
        }


    }
}
