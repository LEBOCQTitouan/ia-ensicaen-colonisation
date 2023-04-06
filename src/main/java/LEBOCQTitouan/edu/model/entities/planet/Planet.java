package LEBOCQTitouan.edu.model.entities.planet;

public class Planet {
    private final int width;
    private final int height;
    private final Cell[][] cells;

    public Planet(int width, int height) {
        this.width = width;
        this.height = height;
        this.cells = new Cell[width][height];
        // TODO load based on model
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                this.cells[i][j] = new Cell();
            }
        }
    }
}