import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[15][15];
        double damageToHeigan = Double.parseDouble(scanner.nextLine());
        double heiganPoints = 3000000;
        int playerPoints = 18500;
        int plR = 7;
        int plC = 7;


        int count = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = count;
                count++;
            }
        }

        String str = "";
        boolean heiganDefeated = false;
        boolean playerDefeated = false;
        while (true) {
            String tokens[] = scanner.nextLine().split(" ");
            String command = tokens[0];
            int r = Integer.parseInt(tokens[1]);
            int c = Integer.parseInt(tokens[2]);

            ArrayList<Integer> numbers = CalcImpactedCells(matrix, r, c);

            heiganPoints-=damageToHeigan;
            if(heiganPoints<=0){
                heiganDefeated=true;
            }
            if (str.equals("Cloud")) {
                playerPoints -= 3500;
                if (playerPoints <= 0) {
                    playerDefeated = true;
                    str=command;
                    break;
                }
            }
            if(heiganPoints<=0){
                break;
            }

            if (numbers.contains(matrix[plR][plC])) {
                if ((plR - 1 >= 0 && plC - 1 >= 0) && !numbers.contains(matrix[plR - 1][plC - 1])) {
                    plC--;
                    plR--;
                }else if (plC + 1 < matrix.length && !numbers.contains(matrix[plR][plC + 1])) {
                    plC++;
                } else if (plR + 1 < matrix.length && !numbers.contains(matrix[plR + 1][plC])) {
                    plR++;
                } else if (plC - 1 >= 0 && !numbers.contains(matrix[plR][plC - 1])) {
                    plC--;
                } else {
                    if (command.equals("Cloud")) {
                        playerPoints -= 3500;
                        str = "Cloud";
                        if (playerPoints <= 0) {
                            playerDefeated = true;
                            break;
                        }
                        str = "Cloud";
                    } else {
                        playerPoints -= 6000;
                        str = "Eruption";
                        if (playerPoints <= 0) {
                            playerDefeated = true;
                            break;
                        }

                    }
                }
            }

        }
        if(heiganDefeated){
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f%n",heiganPoints);
        }
        if(playerDefeated){
            if(str.equals("Cloud")){
                System.out.printf("Player: Killed by Plague Cloud%n");
            }else {
                System.out.printf("Player: Killed by %s%n", str);
            }
        } else {
            System.out.printf("Player: %d%n",playerPoints);
        }
        System.out.printf("Final position: %d, %d",plR,plC);

    }

    private static ArrayList<Integer> CalcImpactedCells(int[][] matrix, int r, int c) {
        int count = 1;
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(matrix[r][c]);
        while (count > 0) {
            if (r - 1 >= 0 && c - 1 >= 0) {
                numbers.add(matrix[r - 1][c - 1]);
            }
            if (r + 1 < matrix.length && c + 1 < matrix.length) {
                numbers.add(matrix[r + 1][c + 1]);
            }
            if (r - 1 >= 0 && c + 1 < matrix.length) {
                numbers.add(matrix[r - 1][c + 1]);
            }
            if (r + 1 < matrix.length && c - 1 >= 0) {
                numbers.add(matrix[r + 1][c - 1]);
            }
            if (r - 1 >= 0) {
                numbers.add(matrix[r - 1][c]);
            }
            if (r + 1 < matrix.length) {
                numbers.add(matrix[r + 1][c]);
            }
            if (c - 1 >= 0) {
                numbers.add(matrix[r][c - 1]);
            }
            if (c + 1 < matrix.length) {
                numbers.add(matrix[r][c + 1]);
            }
            count--;
        }

        return numbers;
    }


}

