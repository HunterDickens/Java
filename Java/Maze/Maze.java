import java.util.HashMap;
import java.util.Map;

public class Maze {
    private final int width;
    private final int height;
    private final Map<String, Boolean> grid;

    public Maze(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new HashMap<>();

        // Initialize maze grid here
        // For simplicity, we'll mark all cells as path (true)
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                grid.put(x + "," + y, true); // true indicates a path
            }
        }

        // Set walls in the maze
        // Example: grid.put("1,1", false); // false indicates a wall
    }

    public boolean isPath(int x, int y) {
        return grid.getOrDefault(x + "," + y, false);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
