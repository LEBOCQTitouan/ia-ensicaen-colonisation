package LEBOCQTitouan.edu.model.commands.shockwave;

import LEBOCQTitouan.edu.model.commands.InterMediatorCommand;
import LEBOCQTitouan.edu.model.entities.Shockwave;
import LEBOCQTitouan.edu.model.entities.planet.Planet;

public abstract class ShockwaveCommand implements InterMediatorCommand {
    private Shockwave shockwave;
    private Planet planet;

    @Override
    public void execute() {
        // TODO Auto-generated method stub need to remove and implement in each child classes
    }

    @Override
    public void updateSimulationMetrics() {
        // TODO Auto-generated method stub need to remove and implement in each child classes
    }
}
