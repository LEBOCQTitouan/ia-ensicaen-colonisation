package LEBOCQTitouan.edu;

import LEBOCQTitouan.edu.model.drivers.Sequencer;
import LEBOCQTitouan.edu.model.entities.Robot;
import LEBOCQTitouan.edu.model.entities.planet.Planet;
import LEBOCQTitouan.edu.presenter.SimulationPresenter;
import LEBOCQTitouan.edu.view.AppWindow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Model initialization
        Planet planet = new Planet(10, 10); // TODO replace with proper dimensions
        List<Robot> robots = Main.generateRobots();

        // Presenter initialization
        Sequencer sequencer = new Sequencer(planet, robots);

        // View initialization
        AppWindow appWindow = new AppWindow();
        SimulationPresenter simulationPresenter = new SimulationPresenter(appWindow, sequencer);

        simulationPresenter.start();
    }

    private static List<Robot> generateRobots() {
        ArrayList<Robot> robots = new ArrayList<>();
        // TODO init scouts
        // TODO init farmers
        // TODO init ore extractors
        // TODO init food retrievers
        // TODO init pipeline builders
        return robots;
    }
}