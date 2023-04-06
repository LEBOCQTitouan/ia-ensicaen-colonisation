package LEBOCQTitouan.edu.model.commands.robot;

import LEBOCQTitouan.edu.model.entities.Robot;
import LEBOCQTitouan.edu.model.entities.planet.Planet;
import LEBOCQTitouan.edu.model.geography.RobotMapper;

public abstract class RobotCommand {
    private Planet planet;
    private Robot robot;
    private RobotMapper robotMapper;
}
