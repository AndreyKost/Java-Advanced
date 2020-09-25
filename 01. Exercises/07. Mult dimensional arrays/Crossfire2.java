import java.util.ArrayList;
import java.util.Scanner;

public class Crossfire2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tokens[] = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        ArrayList<ArrayList<Integer>> matrix = generateMatrix(rows, cols);
        String line = scanner.nextLine();

        while (!line.equals("Nuke it from orbit")) {
            String commands[] = line.split(" ");
            int r = Integer.parseInt(commands[0]);
            int c = Integer.parseInt(commands[1]);
            int radius = Integer.parseInt(commands[2]);

            matrix.get(r).set(c,0);
            while (radius > 0) {
                r--;
                radius--;
                if (r >= 0 && r < matrix.size()) {
                    if (c >= 0 && c < matrix.get(r).size()) {
                        matrix.get(r).set(c,0);
                    }
                }
            }
            r = Integer.parseInt(commands[0]);
            c = Integer.parseInt(commands[1]);
            radius = Integer.parseInt(commands[2]);
            while (radius > 0) {
                r++;
                radius--;
                if (r >= 0 && r < matrix.size()) {
                    if (c >= 0 && c < matrix.get(r).size()) {
                        matrix.get(r).set(c,0);
                    }
                }
            }
            r = Integer.parseInt(commands[0]);
            c = Integer.parseInt(commands[1]);
            radius = Integer.parseInt(commands[2]);
            while (radius > 0) {
                radius--;
                if (r >= 0 && r < matrix.size()) {
                    if (c>= 0 && c < matrix.get(r).size()) {
                        matrix.get(r).set(c,0);
                    }
                }
            }
            r = Integer.parseInt(commands[0]);
            c = Integer.parseInt(commands[1]);
            radius = Integer.parseInt(commands[2]);
            while (radius > 0) {
                c--;
                radius--;
                if (r >= 0 && r < matrix.size()) {
                    if (c >= 0 && c < matrix.get(r).size()) {
                        matrix.get(r).set(c,0);
                    }
                }
            }


            line=scanner.nextLine();
        }

        for (int row = 0; row <matrix.size() ; row++) {
            for (int col = 0; col <matrix.get(row).size() ; col++) {
                System.out.printf("%d ",matrix.get(row).get(col));
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