package LEBOCQTitouan.edu.model.score;

public class SimulationMetricManager {
    private final Metric oreExtractionMetric;
    private final Metric foodExtractionMetric;
    private final Metric waterExtractionMetric;

    public SimulationMetricManager() {
        this.oreExtractionMetric = new Metric(MetricType.ORE_EXTRACTION, 0);
        this.foodExtractionMetric = new Metric(MetricType.FOOD_EXTRACTION, 0);
        this.waterExtractionMetric = new Metric(MetricType.WATER_EXTRACTION, 0);
    }
}
