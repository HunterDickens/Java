public class Main {
    public static void main(String[] args) {
        Maze maze = new Maze(10, 10); // 10x10 maze
        Player player = new Player(0, 0); // Start position (0,0)
        Game game = new Game(maze, player, 9, 9); // End position (9,9)

        // Game loop logic here
        // For example, taking user input and moving the player
        // Checking for win condition
    }
}
