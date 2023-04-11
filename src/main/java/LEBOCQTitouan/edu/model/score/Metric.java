package LEBOCQTitouan.edu.model.score;

public class Metric {
    private final MetricType type;
    private double value;

    public Metric(MetricType type, double value) {
        this.type = type;
        this.value = value;
    }

    public MetricType getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
