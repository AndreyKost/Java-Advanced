import java.util.Scanner;

public class HelensAbduction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int energyOfParis=Integer.parseInt(scanner.nextLine());
        int n=Integer.parseInt(scanner.nextLine());
        int parisPos[]=new int[2];
        int helenPos[]=new int[2];


        char matrix[][]=new char[n][];
        for (int r = 0; r <n ; r++) {
            String line=scanner.nextLine();
            if(line.contains("P")){
                parisPos[0]=r;
                parisPos[1]=line.indexOf("P");
            } else if(line.contains("H")){
                helenPos[0]=r;
                helenPos[1]=line.indexOf("H");
            }
            matrix[r]=line.toCharArray();
        }

        boolean isAlive=true;
        while (true){
            String command[]=scanner.nextLine().split(" ");
            String direction=command[0];
            int enemyRow=Integer.parseInt(command[1]);
            int enemyCol=Integer.parseInt(command[2]);

            enemyMove(matrix,enemyRow,enemyCol);
            isAlive=parisMove(matrix,direction,energyOfParis,parisPos,helenPos);

            if(!isAlive){
                System.out.printf("Paris died at %d;%d.%n",parisPos[0],parisPos[1]);
                matrix[parisPos[0]][parisPos[1]]='X';
                break;
            } else {
                if(matrix[parisPos[0]][parisPos[1]]=='Y'){
                    matrix[parisPos[0]][parisPos[1]]='-';
                    System.out.printf("Paris has successfully abducted Helen!%n");
                    System.out.printf("Energy left: %d%n",energyOfParis);
                    break;
                }
            }



        }

        for (int r = 0; r <matrix.length ; r++) {
            for (int c = 0; c <matrix[r].length ; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }



    }

    private static boolean parisMove(char[][] matrix, String direction, int energyOfParis, int[] parisPos, int[] helenPos) {
        if(direction.equals("up")){
            if(parisPos[0]-1<0){
                energyOfParis-=1;
                if(energyOfParis<=0){
                    matrix[parisPos[0]][parisPos[1]]='X';
                    return false;
                }
            } else {
                matrix[parisPos[0]][parisPos[1]]='-';
                parisPos[0]--;
                if(matrix[parisPos[0]][parisPos[1]]=='S'){
                    energyOfParis-=2;
                    if(energyOfParis>0){
                        matrix[parisPos[0]][parisPos[1]]='P';
                    } else {
                        matrix[parisPos[0]][parisPos[1]]='X';
                        return false;
                    }
                } else if(matrix[parisPos[0]][parisPos[1]]==matrix[helenPos[0]][helenPos[1]]){
                    matrix[parisPos[0]][parisPos[1]]='Y';
                    energyOfParis-=1;
                    return true;
                } else {
                    matrix[parisPos[0]][parisPos[1]]='P';
                    energyOfParis-=1;
                    if(energyOfParis<=0){
                        matrix[parisPos[0]][parisPos[1]]='X';
                        return false;
                    }

                }
            }


        } else if(direction.equals("down")){

            if(parisPos[0]+1>=matrix.length){
                energyOfParis-=1;
                if(energyOfParis<=0){
                    matrix[parisPos[0]][parisPos[1]]='X';
                    return false;
                }
            } else {
                matrix[parisPos[0]][parisPos[1]] = '-';
                parisPos[0]++;
                if (matrix[parisPos[0]][parisPos[1]] == 'S') {
                    energyOfParis -= 2;
                    if (energyOfParis > 0) {
                        matrix[parisPos[0]][parisPos[1]] = 'P';
                    } else {
                        matrix[parisPos[0]][parisPos[1]] = 'X';
                        return false;
                    }
                } else if (matrix[parisPos[0]][parisPos[1]] == matrix[helenPos[0]][helenPos[1]]) {
                    matrix[parisPos[0]][parisPos[1]] = 'Y';
                    energyOfParis -= 1;
                    return true;
                } else {
                    matrix[parisPos[0]][parisPos[1]] = 'P';
                    energyOfParis -= 1;
                    if (energyOfParis <= 0) {
                        matrix[parisPos[0]][parisPos[1]] = 'X';
                        return false;
                    }

                }

            }

        } else if(direction.equals("left")){


            if(parisPos[1]-1<0){
                energyOfParis-=1;
                if(energyOfParis<=0){
                    matrix[parisPos[0]][parisPos[1]]='X';
                    return false;
                }
            } else {
                matrix[parisPos[0]][parisPos[1]] = '-';
                parisPos[1]--;
                if (matrix[parisPos[0]][parisPos[1]] == 'S') {
                    energyOfParis -= 2;
                    if (energyOfParis > 0) {
                        matrix[parisPos[0]][parisPos[1]] = 'P';
                    } else {
                        matrix[parisPos[0]][parisPos[1]] = 'X';
                        return false;
                    }
                } else if (matrix[parisPos[0]][parisPos[1]] == matrix[helenPos[0]][helenPos[1]]) {
                    matrix[parisPos[0]][parisPos[1]] = 'Y';
                    energyOfParis -= 1;
                    return true;
                } else {
                    matrix[parisPos[0]][parisPos[1]] = 'P';
                    energyOfParis -= 1;
                    if (energyOfParis <= 0) {
                        matrix[parisPos[0]][parisPos[1]] = 'X';
                        return false;
                    }

                }

            }


        } else if(direction.equals("right")){



            if(parisPos[1]+1>=matrix[parisPos[0]].length){
                energyOfParis-=1;
                if(energyOfParis<=0){
                    matrix[parisPos[0]][parisPos[1]]='X';
                    return false;
                }
            } else {
                matrix[parisPos[0]][parisPos[1]] = '-';
                parisPos[1]++;
                if (matrix[parisPos[0]][parisPos[1]] == 'S') {
                    energyOfParis -= 2;
                    if (energyOfParis > 0) {
                        matrix[parisPos[0]][parisPos[1]] = 'P';
                    } else {
                        matrix[parisPos[0]][parisPos[1]] = 'X';
                        return false;
                    }
                } else if (matrix[parisPos[0]][parisPos[1]] == matrix[helenPos[0]][helenPos[1]]) {
                    matrix[parisPos[0]][parisPos[1]] = 'Y';
                    energyOfParis -= 1;
                    return true;
                } else {
                    matrix[parisPos[0]][parisPos[1]] = 'P';
                    energyOfParis -= 1;
                    if (energyOfParis <= 0) {
                        matrix[parisPos[0]][parisPos[1]] = 'X';
                        return false;
                    }

                }

            }


        }


        return false;
    }

    private static void enemyMove(char[][] matrix, int enemyRow, int enemyCol) {
        matrix[enemyRow][enemyCol]='S';

    }
}
