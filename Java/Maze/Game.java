public class Game {
    private final Maze maze;
    private final Player player;
    private final int endX;
    private final int endY;

    public Game(Maze maze, Player player, int endX, int endY) {
        this.maze = maze;
        this.player = player;
        this.endX = endX;
        this.endY = endY;
    }

    public boolean movePlayer(int deltaX, int deltaY) {
        int newX = player.getX() + deltaX;
        int newY = player.getY() + deltaY;

        if (maze.isPath(newX, newY)) {
            player.move(deltaX, deltaY);
            return true;
        }
        return false;
    }

    public boolean isWin() {
        return player.getX() == endX && player.getY() == endY;
    }
}
