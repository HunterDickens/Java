import java.util.Random;
import java.util.Scanner;

public class TreasureHuntGame {
    private static final int GRID_SIZE = 5;
    private static final Random random = new Random();
    private static int playerX, playerY;
    private static int treasureX, treasureY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeGame();

        System.out.println("Welcome to the Treasure Hunt! Try to find the treasure.");
        printInstructions();

        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if ("exit".equals(input)) {
                break;
            }

            int distanceBeforeMove = calculateDistance(playerX, playerY, treasureX, treasureY);
            switch (input) {
                case "up":
                    playerY = Math.max(playerY - 1, 0);
                    break;
                case "down":
                    playerY = Math.min(playerY + 1, GRID_SIZE - 1);
                    break;
                case "left":
                    playerX = Math.max(playerX - 1, 0);
                    break;
                case "right":
                    playerX = Math.min(playerX + 1, GRID_SIZE - 1);
                    break;
                default:
                    System.out.println("Invalid move. Use up, down, left, right, or exit.");
                    continue;
            }

            int distanceAfterMove = calculateDistance(playerX, playerY, treasureX, treasureY);

            if (distanceAfterMove == 0) {
                System.out.println("Congratulations, you've found the treasure!");
                break;
            } else if (distanceAfterMove < distanceBeforeMove) {
                System.out.println("Getting warmer...");
            } else {
                System.out.println("Getting colder...");
            }
        }

        scanner.close();
    }

    private static void initializeGame() {
        playerX = random.nextInt(GRID_SIZE);
        playerY = random.nextInt(GRID_SIZE);
        do {
            treasureX = random.nextInt(GRID_SIZE);
            treasureY = random.nextInt(GRID_SIZE);
        } while (treasureX == playerX && treasureY == playerY);
    }

    private static int calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    private static void printInstructions() {
        System.out.println("Use 'up', 'down', 'left', 'right' to move.");
        System.out.println("Type 'exit' to quit the game.");
    }
}
