package LEBOCQTitouan.edu.model.entities.planet;

import LEBOCQTitouan.edu.model.entities.Waterpipe;
import LEBOCQTitouan.edu.model.geography.Direction;

import java.util.HashMap;

public class Cell {
    private final HashMap<Direction, Cell> neighbors;
    private Waterpipe waterpipe;

    public Cell() {
        this.neighbors = new HashMap<>();
    }

    public void addNeighbor(Direction direction, Cell cell) {
        this.neighbors.put(direction, cell);
    }

    public HashMap<Direction, Cell> getNeighbors() {
        return neighbors;
    }

    public void createWaterpipe() {
        this.waterpipe = new Waterpipe(this);
    }
}
