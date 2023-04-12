package LEBOCQTitouan.edu.model.entities.waterpipe;

import java.util.ArrayList;
import java.util.List;

public class WaterpipeHandler {
    private static WaterpipeHandler instance;
    private List<Waterpipe> waterpipes;

    private WaterpipeHandler() {
        this.waterpipes = new ArrayList<>();
    }

    public static WaterpipeHandler getInstance() {
        if (instance == null) {
            instance = new WaterpipeHandler();
        }
        return instance;
    }
}
