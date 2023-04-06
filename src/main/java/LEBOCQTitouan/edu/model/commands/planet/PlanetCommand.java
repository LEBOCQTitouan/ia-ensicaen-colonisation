package LEBOCQTitouan.edu.model.commands.planet;

import LEBOCQTitouan.edu.model.entities.planet.Planet;
import LEBOCQTitouan.edu.model.geography.Coordinate;
import LEBOCQTitouan.edu.model.geography.RobotMapper;

public abstract class PlanetCommand {
    private Planet planet;
    private Coordinate coordinate;
    private RobotMapper robotMapper;
}