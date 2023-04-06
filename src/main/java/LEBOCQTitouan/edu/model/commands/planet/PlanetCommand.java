package LEBOCQTitouan.edu.model.commands.planet;

import LEBOCQTitouan.edu.model.commands.InterMediatorCommand;
import LEBOCQTitouan.edu.model.entities.planet.Planet;
import LEBOCQTitouan.edu.model.geography.Coordinate;
import LEBOCQTitouan.edu.model.geography.RobotMapper;

public abstract class PlanetCommand implements InterMediatorCommand {
    private Planet planet;
    private Coordinate coordinate;
    private RobotMapper robotMapper;

    @Override
    public void execute() {
        // TODO Auto-generated method stub need to remove and implement in each child classes
    }
}