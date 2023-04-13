package LEBOCQTitouan.edu.model;

import LEBOCQTitouan.edu.presenter.ModelSubscriber;

public interface ModelPublisher {
    void addModelSubscriber(ModelSubscriber modelSubscriber);
    void removeModelSubscriber(ModelSubscriber modelSubscriber);
    void notifyModelSubscribers();
}
