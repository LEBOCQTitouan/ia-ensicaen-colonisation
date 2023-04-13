package LEBOCQTitouan.edu.model.entities;

import LEBOCQTitouan.edu.model.ModelPublisher;
import LEBOCQTitouan.edu.model.commands.InterMediatorCommand;
import LEBOCQTitouan.edu.presenter.ModelSubscriber;

import java.util.ArrayList;
import java.util.List;

public class Robot implements ModelPublisher {
    private final List<ModelSubscriber> subscribers;

    public Robot() {
        this.subscribers = new ArrayList<>();
    }

    public List<InterMediatorCommand> compute() {
        ArrayList<InterMediatorCommand> generatedCommands = new ArrayList<>();
        return generatedCommands;
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
