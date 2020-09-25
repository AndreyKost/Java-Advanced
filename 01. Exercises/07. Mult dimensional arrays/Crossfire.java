import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(" ");
        int R=Integer.parseInt(tokens[0]);
        int C=Integer.parseInt(tokens[1]);
        int[][] matrix=new int[R][C];
        int count=0;

        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix[0].length ; col++) {
                count++;
                matrix[row][col]=count;
            }
        }


        ArrayList<Integer> numbers=new ArrayList<>();
        String line=scanner.nextLine();
        while(!line.equals("Nuke it from orbit")){
            String commands[]=line.split(" ");
            int r=Integer.parseInt(commands[0]);
            int c=Integer.parseInt(commands[1]);
            int radius=Integer.parseInt(commands[2]);

            numbers.add(matrix[r][c]);
            while(radius>0){
                r--;
                radius--;
                if(r>=0 && r<matrix.length){
                    if(c>=0 && c<matrix[r].length){
                        numbers.add(matrix[r][c]);
                    }
                }
            }
            r=Integer.parseInt(commands[0]);
            c=Integer.parseInt(commands[1]);
            radius=Integer.parseInt(commands[2]);
            while ( radius>0){
                r++;
                radius--;
                if(r>=0 && r<matrix.length){
                    if(c>=0 && c<matrix[r].length){
                        numbers.add(matrix[r][c]);
                    }
                }
            }
            r=Integer.parseInt(commands[0]);
            c=Integer.parseInt(commands[1]);
            radius=Integer.parseInt(commands[2]);
            while ( radius>0){
                c--;
                radius--;
                if(r>=0 && r<matrix.length){
                    if(c>=0 && c<matrix[r].length){
                        numbers.add(matrix[r][c]);
                    }
                }
            }
            r=Integer.parseInt(commands[0]);
            c=Integer.parseInt(commands[1]);
            radius=Integer.parseInt(commands[2]);
            while ( radius>0){
                c++;
                radius--;
                if(r>=0 && r<matrix.length){
                    if(c>=0 && c<matrix[r].length){
                        numbers.add(matrix[r][c]);
                    }
                }

            }

            ArrayList<Integer> cols=new ArrayList<>();
            ArrayDeque<String> queue=new ArrayDeque<>();
            for (int row = 0; row <matrix.length ; row++) {
                String str="";
                for (int col = 0; col <matrix[row].length ; col++) {
                    if(!numbers.contains(matrix[row][col])){
                        cols.add(col);
                        str=str+matrix[row][col]+" ";
                    }
                }
                if(!str.equals("")) {
                    queue.offer(str);
                }
            }

            int max=Integer.MIN_VALUE;
            for (Integer cos : cols) {
                if(cos >max){
                    max=cos;
                }
            }
            int size=queue.size();

            int[][] mtrx=new int[size][];
            for (int row = 0; row <size ; row++) {
                String appendTokens[]=queue.poll().split(" ");
                mtrx[row]=new int[appendTokens.length];
                for (int col = 0; col <appendTokens.length ; col++) {
                    mtrx[row][col]=Integer.parseInt(appendTokens[col]);
                }
            }

            matrix=mtrx;

         line=scanner.nextLine();
        }

        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                System.out.printf("%d ",matrix[row][col]);
            }
            System.out.println();
        }


    }
}
