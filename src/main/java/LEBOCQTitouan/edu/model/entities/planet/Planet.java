package LEBOCQTitouan.edu.model.entities.planet;

import LEBOCQTitouan.edu.model.commands.InterMediatorCommand;
import LEBOCQTitouan.edu.model.geography.Direction;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private final int width;
    private final int height;
    private final Cell[][] cells;

    private void initNeighbors() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i > 0) {
                    this.cells[i][j].addNeighbor(Direction.WEST, this.cells[i - 1][j]);
                }
                if (i < width - 1) {
                    this.cells[i][j].addNeighbor(Direction.EAST, this.cells[i + 1][j]);
                }
                if (j > 0) {
                    this.cells[i][j].addNeighbor(Direction.NORTH, this.cells[i][j - 1]);
                    if (i > 0) {
                        this.cells[i][j].addNeighbor(Direction.NORTH_WEST, this.cells[i - 1][j - 1]);
                    }
                    if (i < width - 1) {
                        this.cells[i][j].addNeighbor(Direction.NORTH_EAST, this.cells[i + 1][j - 1]);
                    }
                }
                if (j < height - 1) {
                    this.cells[i][j].addNeighbor(Direction.SOUTH, this.cells[i][j + 1]);
                    if (i > 0) {
                        this.cells[i][j].addNeighbor(Direction.SOUTH_WEST, this.cells[i - 1][j + 1]);
                    }
                    if (i < width - 1) {
                        this.cells[i][j].addNeighbor(Direction.SOUTH_EAST, this.cells[i + 1][j + 1]);
                    }
                }
            }
        }
    }

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
        initNeighbors();
    }

    public List<InterMediatorCommand> react() {
        ArrayList<InterMediatorCommand> generatedCommands = new ArrayList<>();
        return generatedCommands;
    }
}
