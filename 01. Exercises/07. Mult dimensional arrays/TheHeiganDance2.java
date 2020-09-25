import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheHeiganDance2 {
    // Heigan’s chamber is a 15-by-15 two-dimensional array. The player always starts at the exact center.
    private static int playerRow = 7;
    private static int playerCol = 7;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double damage = Double.parseDouble(reader.readLine());

        double playerHealth = 18500;
        double bossHealth = 3000000;

        boolean shouldTakeDamage = false;

        String lastCastedSpell = "";

        // The fight is over either when the player is killed, or Heigan is defeated.
        while (playerHealth > 0 && bossHealth > 0) {
            // Both Heigan and the player may die in the same turn.
            bossHealth -= damage;

            //  If Heigan is dead, the spell he would have casted is ignored.
            if (shouldTakeDamage) {
                playerHealth -= 3500;
                shouldTakeDamage = false;
            }

            if (playerHealth < 0 || bossHealth < 0) {
                break;
            }

            String[] tokens = reader.readLine().split("\\s+");

            String spell = tokens[0];
            int targetRow = Integer.parseInt(tokens[1]);
            int targetCol = Integer.parseInt(tokens[2]);

            boolean isHit = checkCell(targetRow, targetCol);

            if (isHit && bossHealth > 0) {
                // If the player’s current position is within the area of damage, the player tries to move.
                boolean hasMoved = movePlayer(targetRow, targetCol);
                if (!hasMoved) {
                    // If he cannot move in any direction, because the cell is damaged or there is a wall, the player stays in place and takes the damage.
                    if (spell.equals("Cloud")) {
                        playerHealth -= 3500;
                        shouldTakeDamage = true;
                    } else {
                        playerHealth -= 6000;
                    }
                    lastCastedSpell = spell;
                }
            }
        }

        if (bossHealth <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.println(String.format("Heigan: %.2f", bossHealth));
        }

        if (playerHealth <= 0) {
            if (lastCastedSpell.equals("Cloud")) {
                System.out.println("Player: Killed by Plague " + lastCastedSpell);
            } else {
                System.out.println("Player: Killed by " + lastCastedSpell);
            }
        } else {
            System.out.println(String.format("Player: %.0f", playerHealth));
        }

        System.out.println(String.format("Final position: %d, %d", playerRow, playerCol));
    }

    private static boolean movePlayer(int targetRow, int targetCol) {
        boolean hasMoved = false;
        if (isInRange(playerRow - 1, playerCol) &&
                canMove(targetRow, targetCol, playerRow - 1, playerCol)) {
            playerRow--;
            hasMoved = true;
        } else if (isInRange(playerRow + 1, playerCol) &&
                canMove(targetRow, targetCol, playerRow + 1, playerCol)) {
            playerRow++;
            hasMoved = true;
        } else if (isInRange(playerRow, playerCol - 1) &&
                canMove(targetRow, targetCol, playerRow, playerCol - 1)) {
            playerCol--;
            hasMoved = true;
        } else if (isInRange(playerRow, playerCol + 1) &&
                canMove(targetRow, targetCol, playerRow, playerCol + 1)) {
            playerCol++;
            hasMoved = true;
        }
        return hasMoved;
    }

    private static boolean isInRange(int row, int col) {
        return row >= 0 && row < 15 && col >= 0 && col < 15;
    }

    private static boolean canMove(int targetRow, int targetCol, int newRow, int newCol) {
        return newRow < targetRow - 1 || newRow > targetRow + 1 ||
                newCol < targetCol - 1 || newCol > targetCol + 1;
    }

    private static boolean checkCell(int targetRow, int targetCol) {
        return playerRow >= targetRow - 1 && playerRow <= targetRow + 1 &&
                playerCol >= targetCol - 1 && playerCol <= targetCol + 1;
    }
}