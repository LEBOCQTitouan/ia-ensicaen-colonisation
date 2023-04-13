package LEBOCQTitouan.edu.presenter;

import LEBOCQTitouan.edu.model.ModelPublisher;
import LEBOCQTitouan.edu.view.ui.canvas.DisplayableComponent;

import java.util.HashMap;
import java.util.List;

public abstract class ModelSubscriber {
    private HashMap<ModelPublisher, List<DisplayableComponent>> modelPublisherToDisplayableComponents;
    public void update(ModelPublisher modelPublisher) {
        // TODO
    }
}
