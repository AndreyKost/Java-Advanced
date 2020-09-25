import java.util.Scanner;

public class MatrixShuffling {
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

        int a;
        int b;
        int swap;
        String line=scanner.nextLine();
        while (!line.equals("END")){
            String commands[]=line.split(" ");
            String word=commands[0];
            if(commands.length>5){
                System.out.println("Invalid input!");
            } else {
                if(!word.equals("swap")){
                    System.out.println("Invalid input!");
                } else {
                    int r1=Integer.parseInt(commands[1]);
                    int c1=Integer.parseInt(commands[2]);
                    int r2=Integer.parseInt(commands[3]);
                    int c2=Integer.parseInt(commands[4]);
                    if(r1<0 || r1>=R || c1<0 || c1>=C || r2<0 || r2>=R || c2<0 || c2>=C){
                        System.out.println("Invalid input!");
                    } else {
                        a=matrix[r1][c1];
                        b=matrix[r2][c2];
                        //swap=a;
                        matrix[r1][c1]=b;
                        matrix[r2][c2]=a;
                        for (int row = 0; row <R ; row++) {
                            for (int col = 0; col <C ; col++) {
                                System.out.printf("%d ",matrix[row][col]);
                            }
                            System.out.println();
                        }
                    }
                }
            }

            line=scanner.nextLine();
        }



    }
}
