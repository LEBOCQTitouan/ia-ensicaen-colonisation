package LEBOCQTitouan.edu.view.ui;

import javax.swing.*;
import java.awt.*;

public class StatHolder extends JPanel {
    private JLabel oreStockLabel;
    private JLabel foodStockLabel;
    private JLabel WaterStockLabel;

    private JLabel ageLabel;

    private JLabel planetStatusLabel;
    private JLabel robotStatusLabel;

    private void initContent() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBorder(BorderFactory.createTitledBorder("Stats"));

        oreStockLabel = new JLabel("Ore stock: ");
        foodStockLabel = new JLabel("Food stock: ");
        WaterStockLabel = new JLabel("Water stock: ");

        ageLabel = new JLabel("Age: ");

        planetStatusLabel = new JLabel("Planet status: ");
        robotStatusLabel = new JLabel("Robot status: ");

        this.add(oreStockLabel);
        this.add(foodStockLabel);
        this.add(WaterStockLabel);
        this.add(ageLabel);
        this.add(planetStatusLabel);
        this.add(robotStatusLabel);
    }

    public StatHolder(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
        initContent();
    }

    public StatHolder(LayoutManager layout) {
        super(layout);
        initContent();
    }

    public StatHolder(boolean isDoubleBuffered) {
        super(isDoubleBuffered);
        initContent();
    }

    public StatHolder() {
        initContent();
    }
}
