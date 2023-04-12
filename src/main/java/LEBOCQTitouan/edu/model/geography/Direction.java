package LEBOCQTitouan.edu.model.geography;

public enum Direction {
    NORTH(0, -1),
    NORTH_EAST(1, -1),
    NORTH_WEST(-1, -1),
    SOUTH(0, 1),
    SOUTH_EAST(1, 1),
    SOUTH_WEST(-1, 1),
    EAST(1, 0),
    WEST(-1, 0);

    public final int offsetX;
    public final int offsetY;

    Direction(int offsetX, int offsetY) {
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }
}
