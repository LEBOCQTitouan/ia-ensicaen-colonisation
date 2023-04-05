package LEBOCQTitouan.edu.model.geography;

import LEBOCQTitouan.edu.model.entities.Robot;

import java.util.HashMap;
import java.util.List;

public class RobotMapper {
    private final HashMap<Robot, Coordinate> robotCoordinateHashMap;

    public RobotMapper(List<Robot> robots) {
        this.robotCoordinateHashMap = new HashMap<>();
        for (Robot robot : robots) {
            this.robotCoordinateHashMap.put(robot, new Coordinate(0, 0));
        }
    }

    public Coordinate getCoordinate(Robot robot) {
        return this.robotCoordinateHashMap.get(robot);
    }
}
