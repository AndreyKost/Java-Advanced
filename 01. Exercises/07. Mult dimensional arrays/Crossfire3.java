import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Crossfire3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[] = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        ArrayList<ArrayList<Integer>> matrix = generateMatrix(rows, cols);
        String line = scanner.nextLine();

        while (!line.equals("Nuke it from orbit")) {
            String commands[] = line.split(" ");
            int row = Integer.parseInt(commands[0]);
            int col = Integer.parseInt(commands[1]);
            int radius = Integer.parseInt(commands[2]);


            for (int r = row-radius; r <=row+radius ; r++) {
                if(isInBounds(matrix,r,col)){
                    matrix.get(r).set(col,0);
                }
            }
            for (int c = col-radius; c <=col+radius ; c++) {
                if(isInBounds(matrix,row,c)){
                    matrix.get(row).set(c,0);
                }
            }


            for (int r = 0; r <matrix.size() ; r++) {
                /*matrix.set(r, matrix.get(r)
                        .stream()
                        .filter(element -> element!=0)
                        .collect(Collectors.toCollection(ArrayList::new)));*/

                matrix.get(r).removeAll(new ArrayList<Integer>(){{add(0);}});

                if(matrix.get(r).size()==0){
                    matrix.remove(r);
                    r--;
                }

            }


            line=scanner.nextLine();
        }


        printMatrix(matrix);
    }

    private static boolean isInBounds(ArrayList<ArrayList<Integer>> matrix, int row, int col) {
        if( row>=0 && row< matrix.size() && col>=0 && col < matrix.get(row).size()){
         return true;
        } else {
            return false;
        }
    }


    private static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (int row = 0; row <matrix.size() ; row++) {
            for (int col = 0; col <matrix.get(row).size() ; col++) {
                    System.out.print(matrix.get(row).get(col) + " ");
            }
            System.out.println();
        }
    }

    private static ArrayList<ArrayList<Integer>> generateMatrix(int rows, int cols) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        int count = 1;

        for (int r = 0; r < rows; r++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int c = 0; c < cols; c++) {
                row.add(count);
                count++;
            }
            matrix.add(row);
        }
        return matrix;
    }
}
