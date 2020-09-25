import java.util.Scanner;

public class TronRacers {

    private static int
            row1=0,
            col1=0,
            row2=0,
          col2=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        char matrix[][]=new char[n][n];

        for (int r = 0; r <n ; r++) {
            String line=scanner.nextLine();
            for (int c = 0; c <n ; c++) {
                matrix[r][c]=line.charAt(c);
            }
        }

        for (int r = 0; r <n ; r++) {
            for (int c = 0; c <n ; c++) {
                if(matrix[r][c]=='f'){
                    row1=r;
                    col1=c;
                }
                if(matrix[r][c]=='s'){
                    row2=r;
                    col2=c;
                }
            }
        }

        boolean isAlive1=true;
        boolean isAlive2=true;
        while (isAlive2){
            String command[]=scanner.nextLine().split(" ");
            String command1=command[0];
            String command2=command[1];
            isAlive1=calculate(matrix,command1,row1,col1);
            if(!isAlive1){
                break;
            }
            isAlive2=calculate2(matrix,command2,row2,col2);


        }


        for (int r = 0; r <n ; r++) {
            for (int c = 0; c <n ; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }




    }

    private static boolean calculate2(char[][] matrix, String command2, int r2, int c2) {
        int newRow=r2;
        int newCol=c2;

        if(command2.equals("up")){
            --newRow;
            if(newRow>=0){
                if(matrix[newRow][newCol]!='f'){
                    matrix[newRow][newCol]='s';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            } else {
                newRow=matrix.length-1;
                if(matrix[newRow][newCol]!='f'){
                    matrix[newRow][newCol]='s';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            }
        } else if(command2.equals("down")){
            ++newRow;
            if(newRow<=matrix.length-1){
                if(matrix[newRow][newCol]!='f'){
                    matrix[newRow][newCol]='s';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            } else {
                newRow=0;
                if(matrix[newRow][newCol]!='f'){
                    matrix[newRow][newCol]='s';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            }
        } else if(command2.equals("left")){
            --newCol;
            if(newCol>=0){
                if(matrix[newRow][newCol]!='f'){
                    matrix[newRow][newCol]='s';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            } else {
                newCol=matrix.length-1;
                if(matrix[newRow][newCol]!='f'){
                    matrix[newRow][newCol]='s';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            }
        } else if(command2.equals("right")){
            ++newCol;
            if(newCol<=matrix.length-1){
                if(matrix[newRow][newCol]!='f'){
                    matrix[newRow][newCol]='s';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            } else {
                newCol=0;
                if(matrix[newRow][newCol]!='f'){
                    matrix[newRow][newCol]='s';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            }
        }

        row2=newRow;
        col2=newCol;

        return true;
    }

    private static boolean calculate(char[][] matrix, String command1, int r1, int c1) {
        int newRow=r1;
        int newCol=c1;

        if(command1.equals("up")){
            --newRow;
            if(newRow>=0){
                if(matrix[newRow][newCol]!='s'){
                    matrix[newRow][newCol]='f';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            } else {
                newRow=matrix.length-1;
                if(matrix[newRow][newCol]!='s'){
                    matrix[newRow][newCol]='f';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            }
        } else if(command1.equals("down")){
            ++newRow;
            if(newRow<=matrix.length-1){
                if(matrix[newRow][newCol]!='s'){
                    matrix[newRow][newCol]='f';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            } else {
                newRow=0;
                if(matrix[newRow][newCol]!='s'){
                    matrix[newRow][newCol]='f';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            }
        } else if(command1.equals("left")){
            --newCol;
            if(newCol>=0){
                if(matrix[newRow][newCol]!='s'){
                    matrix[newRow][newCol]='f';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            } else {
                newCol=matrix.length-1;
                if(matrix[newRow][newCol]!='s'){
                    matrix[newRow][newCol]='f';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            }
        } else if(command1.equals("right")){
            ++newCol;
            if(newCol<=matrix.length-1){
                if(matrix[newRow][newCol]!='s'){
                    matrix[newRow][newCol]='f';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            } else {
                newCol=0;
                if(matrix[newRow][newCol]!='s'){
                    matrix[newRow][newCol]='f';
                } else {
                    matrix[newRow][newCol]='x';
                    return false;
                }
            }
        }

        row1=newRow;
        col1=newCol;

        return true;
    }


}
