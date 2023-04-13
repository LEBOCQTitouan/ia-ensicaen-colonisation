package LEBOCQTitouan.edu.model.entities.planet;

import LEBOCQTitouan.edu.model.ModelPublisher;
import LEBOCQTitouan.edu.model.entities.waterpipe.Waterpipe;
import LEBOCQTitouan.edu.model.geography.Direction;
import LEBOCQTitouan.edu.presenter.ModelSubscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cell implements ModelPublisher {
    private final HashMap<Direction, Cell> neighbors;
    private final List<ModelSubscriber> subscribers;
    private Waterpipe waterpipe;

    public Cell() {
        this.neighbors = new HashMap<>();
        this.subscribers = new ArrayList<>();
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

    @Override
    public void addModelSubscriber(ModelSubscriber modelSubscriber) {
        // TODO
    }

    @Override
    public void removeModelSubscriber(ModelSubscriber modelSubscriber) {
        // TODO
    }

    @Override
    public void notifyModelSubscribers() {
        // TODO
    }
}
