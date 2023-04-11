package LEBOCQTitouan.edu.presenter;

import LEBOCQTitouan.edu.model.drivers.Sequencer;
import LEBOCQTitouan.edu.model.score.SimulationMetricManager;
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

    public void step() {
        sequencer.step();
        // Update view
        // Metrics
        SimulationMetricManager metricManager = sequencer.getMetricManager();
        appWindow.setScore(metricManager.getFoodExtractionMetric());
        appWindow.setScore(metricManager.getOreExtractionMetric());
        appWindow.setScore(metricManager.getWaterExtractionMetric());
    }
}
