import java.util.ArrayDeque;
        import java.util.ArrayList;
        import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[][] matrix=new char[8][8];

        for (int row = 0; row <matrix.length ; row++) {
            String tokens[]=scanner.nextLine().split(" ");
            char[] append=new char[tokens.length];
            for (int i = 0; i <tokens.length ; i++) {
                append[i]=tokens[i].charAt(0);
            }
            for (int col = 0; col <matrix[0].length ; col++) {
                matrix[row][col]=append[col];
            }
        }


        ArrayDeque<Integer> queue=new ArrayDeque<>();
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix[0].length ; col++) {
                if(matrix[row][col]=='q'){
                    queue.offer(row);
                    queue.offer(col);
                }
            }
        }

        while (queue.size()>0){
            int row=queue.poll();
            int col=queue.poll();
            boolean isValid1=true;
            boolean isValid2=true;
            boolean isValid3=true;
            boolean isValid4=true;
            boolean isValid5=true;
            boolean isValid6=true;
            int rw=0;
            int cl=0;
            for (int c = 0; c <8 ; c++) {
                if (matrix[row][c]=='q' && c!=col) {
                    isValid1=false;
                }
            }
            for (int r = 0; r <8 ; r++) {
                if(matrix[r][col]=='q' && r!=row){
                    isValid2=false;
                }
            }
            rw=row;
            cl=col;
            while(rw!=0 && cl!=0){
                rw--;
                cl--;
                if(matrix[rw][cl]=='q'){
                    isValid3=false;
                }
            }
            rw=row;
            cl=col;
            while (rw!=7 && cl!=7){
                rw++;
                cl++;
                if(matrix[rw][cl]=='q'){
                    isValid4=false;
                }
            }
            rw=row;
            cl=col;
            while (rw!=7 && cl!=0){
                rw++;
                cl--;
                if(matrix[rw][cl]=='q'){
                    isValid5=false;
                }
            }
            rw=row;
            cl=col;
            while (rw!=0 && cl!=7){
                rw--;
                cl++;
                if(matrix[rw][cl]=='q'){
                    isValid6=false;
                }
            }
            if(isValid1 && isValid2 && isValid3 && isValid4 && isValid5 && isValid6){
                System.out.printf("%d %d",row,col);
                break;
            }

        }


    }
}
