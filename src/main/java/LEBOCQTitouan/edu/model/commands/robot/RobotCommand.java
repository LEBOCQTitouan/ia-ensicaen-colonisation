package LEBOCQTitouan.edu.model.commands.robot;

import LEBOCQTitouan.edu.model.commands.InterMediatorCommand;
import LEBOCQTitouan.edu.model.entities.Robot;
import LEBOCQTitouan.edu.model.entities.planet.Planet;
import LEBOCQTitouan.edu.model.geography.RobotMapper;

public abstract class RobotCommand implements InterMediatorCommand {
    private Planet planet;
    private Robot robot;
    private RobotMapper robotMapper;

    @Override
    public void execute() {
        // TODO Auto-generated method stub need to remove and implement in each child classes
    }

    @Override
    public void updateSimulationMetrics() {
        // TODO Auto-generated method stub need to remove and implement in each child classes
    }
}
