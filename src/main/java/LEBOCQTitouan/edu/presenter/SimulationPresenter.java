package LEBOCQTitouan.edu.presenter;

import LEBOCQTitouan.edu.model.Sequencer;
import LEBOCQTitouan.edu.view.AppWindow;

public class SimulationPresenter {
    private final AppWindow appWindow;
    private final Sequencer sequencer;

    public SimulationPresenter(AppWindow appWindow, Sequencer sequencer) {
        this.appWindow = appWindow;
        this.sequencer = sequencer;
    }

    public void start() {
        appWindow.setPresenter(this);
        appWindow.setVisible(true);
    }
}
