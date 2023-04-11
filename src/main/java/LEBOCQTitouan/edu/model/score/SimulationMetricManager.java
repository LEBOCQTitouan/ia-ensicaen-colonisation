package LEBOCQTitouan.edu.model.score;

public class SimulationMetricManager {
    private final Metric oreExtractionMetric;
    private final Metric foodExtractionMetric;
    private final Metric waterExtractionMetric;

    public SimulationMetricManager() {
        this.oreExtractionMetric = new Metric("Ore Extraction", 0);
        this.foodExtractionMetric = new Metric("Food Extraction", 0);
        this.waterExtractionMetric = new Metric("Water Extraction", 0);
    }
}
