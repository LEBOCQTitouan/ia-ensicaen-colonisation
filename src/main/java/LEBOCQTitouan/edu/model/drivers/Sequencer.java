package LEBOCQTitouan.edu.model.drivers;

import LEBOCQTitouan.edu.model.commands.InterMediatorCommand;
import LEBOCQTitouan.edu.model.entities.Robot;
import LEBOCQTitouan.edu.model.entities.planet.Planet;
import LEBOCQTitouan.edu.model.score.SimulationMetricManager;

import java.util.ArrayList;
import java.util.List;

public class Sequencer {
    private final InterMediator interMediator;
    private final SimulationMetricManager metricManager;

    public Sequencer(Planet planet, List<Robot> robots) {
        this.interMediator = new InterMediator(planet, robots);
        this.metricManager = new SimulationMetricManager();
    }

    public void step() {
        ArrayList<InterMediatorCommand> buffer = new ArrayList<>();
        interMediator.stepShockwaves();
        for (InterMediatorCommand command : buffer) {
            command.execute();
        }
        interMediator.stepPlanet();
        for (InterMediatorCommand command : buffer) {
            command.execute();
        }
        interMediator.stepRobots();
        for (InterMediatorCommand command : buffer) {
            command.execute();
        }
    }
}
