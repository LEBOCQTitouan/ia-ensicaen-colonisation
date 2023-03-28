package LEBOCQTitouan.edu;

import LEBOCQTitouan.edu.model.Sequencer;
import LEBOCQTitouan.edu.presenter.SimulationPresenter;
import LEBOCQTitouan.edu.view.AppWindow;

public class Main {
    public static void main(String[] args) {
        AppWindow appWindow = new AppWindow();
        Sequencer sequencer = new Sequencer();
        SimulationPresenter simulationPresenter = new SimulationPresenter(appWindow, sequencer);

        simulationPresenter.start();
    }
}