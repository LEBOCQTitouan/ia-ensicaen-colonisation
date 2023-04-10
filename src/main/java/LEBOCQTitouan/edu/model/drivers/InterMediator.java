package LEBOCQTitouan.edu.model.drivers;

import LEBOCQTitouan.edu.model.commands.InterMediatorCommand;
import LEBOCQTitouan.edu.model.entities.planet.Planet;
import LEBOCQTitouan.edu.model.entities.Robot;
import LEBOCQTitouan.edu.model.entities.Shockwave;
import LEBOCQTitouan.edu.model.geography.RobotMapper;

import java.util.ArrayList;
import java.util.List;

public class InterMediator {
    private final RobotMapper robotMapper;
    private final Planet planet;
    private final List<Robot> robots;
    private final List<Shockwave> shockwaves;

    public InterMediator(Planet planet, List<Robot> robots) {
        this.planet = planet;
        this.robots = robots;
        this.shockwaves = new ArrayList<>();
        this.robotMapper = new RobotMapper(robots);
    }

    public List<InterMediatorCommand> stepShockwaves() {
        ArrayList<InterMediatorCommand> generatedCommands = new ArrayList<>();
        for (Shockwave shockwave : shockwaves) {
            generatedCommands.addAll(shockwave.propagate());
        }
        return generatedCommands;
    }

    public List<InterMediatorCommand> stepPlanet() {
        ArrayList<InterMediatorCommand> generatedCommands = new ArrayList<>();
        generatedCommands.addAll(planet.react());
        return generatedCommands;
    }

    public List<InterMediatorCommand> stepRobots() {
        ArrayList<InterMediatorCommand> generatedCommands = new ArrayList<>();
        for (Robot robot : robots) {
            generatedCommands.addAll(robot.compute());
        }
        return generatedCommands;
    }
}
