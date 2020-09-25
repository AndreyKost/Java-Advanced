import java.util.Scanner;

public class Sneaking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        char matrix[][]=new char[n][];

        for (int r = 0; r <n ; r++) {
            matrix[r]=scanner.nextLine().toCharArray();
        }

        String line=scanner.nextLine();
        int rowSam=0;
        int colSam=0;
        boolean isAliveS=true;
        boolean isAliveN=true;

        for (int i = 0; i <line.length() ; i++) {
            char command=line.charAt(i);


            for (int r = 0; r <matrix.length ; r++) {
                for (int c = 0; c <matrix[0].length ; c++) {
                    if(matrix[r][c]=='b'){
                        for (int col = 0; col <matrix[0].length; col++) {
                            if(matrix[r][col]=='S'){
                                if(col>c){
                                    matrix[r][col]='X';
                                    rowSam=r;
                                    colSam=col;
                                    isAliveS=false;
                                    break;
                                }
                            }
                        }
                        if(c==matrix[0].length-1){
                            matrix[r][c]='d';
                        } else {
                            matrix[r][c]='.';
                            matrix[r][c+1]='b';
                            break;
                        }
                        if(!isAliveS){
                            break;
                        }
                    }
                    if(!isAliveS){
                        break;
                    }
                    if(matrix[r][c]=='d'){
                        for (int col = 0; col <matrix[0].length; col++) {
                            if(matrix[r][col]=='S'){
                                if(col<c){
                                    matrix[r][col]='X';
                                    rowSam=r;
                                    colSam=col;
                                    isAliveS=false;
                                    break;
                                }
                            }
                        }
                        if(c==0){
                            matrix[r][c]='b';
                        } else {
                            matrix[r][c]='.';
                            matrix[r][c-1]='d';
                            break;
                        }
                    }
                    if(!isAliveS){
                        break;
                    }

                }
                if(!isAliveS){
                    break;
                }

            }

            if(!isAliveS){
                break;
            }

            boolean isSMoved=false;

            for (int r = 0; r <matrix.length ; r++) {
                for (int c = 0; c <matrix[0].length ; c++) {
                    if(matrix[r][c]=='S'){
                        if(command=='U'){
                            matrix[r][c]='.';
                            matrix[r-1][c]='S';
                            for (int col =0; col <matrix[0].length ; col++) {
                                if(matrix[r-1][col]=='N'){
                                    matrix[r-1][col]='X';
                                    isAliveN=false;
                                    break;
                                }
                            }
                            isSMoved=true;
                            break;
                        } else if(command=='D'){
                            matrix[r][c]='.';
                            matrix[r+1][c]='S';
                            for (int col =0; col <matrix[0].length ; col++) {
                                if(matrix[r+1][col]=='N'){
                                    matrix[r+1][col]='X';
                                    isAliveN=false;
                                    break;
                                }
                            }
                            isSMoved=true;
                            break;
                        } else if(command=='L'){
                            matrix[r][c]='.';
                            matrix[r][c-1]='S';
                            for (int col =0; col <matrix[0].length ; col++) {
                                if(matrix[r][col]=='N'){
                                    matrix[r][col]='X';
                                    isAliveN=false;
                                    break;
                                }
                            }
                            isSMoved=true;
                            break;
                        } else if(command=='R'){
                            matrix[r][c]='.';
                            matrix[r][c+1]='S';
                            for (int col =0; col <matrix[0].length ; col++) {
                                if(matrix[r][col]=='N'){
                                    matrix[r][col]='X';
                                    isAliveN=false;
                                    break;
                                }
                            }
                            isSMoved=true;
                            break;
                        } else {}

                        if(!isAliveN){
                            break;
                        }
                        if(isSMoved){
                            break;
                        }
                    }
                    if(!isAliveN){
                        break;
                    }
                    if(isSMoved){
                        break;
                    }
                }
                if(!isAliveN){
                    break;
                }
                if(isSMoved){
                    break;
                }
            }

            if(!isAliveN){
                break;
            }



        }

        if(isAliveN){
            System.out.printf("Sam died at %d, %d%n",rowSam,colSam);
        } else {
            System.out.println("Nikoladze killed!");
        }

        for (int r = 0; r <n ; r++) {
            for (int c = 0; c <matrix[0].length ; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }


    }
}