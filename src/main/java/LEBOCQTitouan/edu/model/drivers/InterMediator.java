package LEBOCQTitouan.edu.model.drivers;

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
}
