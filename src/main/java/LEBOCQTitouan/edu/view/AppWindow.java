package LEBOCQTitouan.edu.view;

import LEBOCQTitouan.edu.model.score.Metric;
import LEBOCQTitouan.edu.presenter.SimulationPresenter;
import LEBOCQTitouan.edu.view.ui.canvas.Canvas;
import LEBOCQTitouan.edu.view.ui.StatHolder;

import javax.swing.*;
import java.awt.*;

public class AppWindow extends JFrame {
    private SimulationPresenter presenter;
    private StatHolder statHolder;
    private Canvas canvas;
    private void initContent() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        statHolder = new StatHolder();
        canvas = new Canvas();

        JButton stepButton = new JButton("Step");
        stepButton.addActionListener(e -> presenter.step());

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.weighty = 1;

        JPanel componentHolder = new JPanel();
        componentHolder.setLayout(new BoxLayout(componentHolder, BoxLayout.Y_AXIS));
        componentHolder.add(statHolder);
        componentHolder.add(stepButton);

        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.NORTHWEST;
        panel.add(componentHolder, c);
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(10, 10, 10, 10);
        panel.add(canvas, c);

        panel.setBackground(Color.RED);

        this.setContentPane(panel);
    }

    public AppWindow() {
        super("Colonisation Simulation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setResizable(false);

        initContent();
    }

    public void setPresenter(SimulationPresenter presenter) {
        this.presenter = presenter;
    }

    public void setScore(Metric metric) {
        switch (metric.getType()) {
            case ORE_EXTRACTION -> statHolder.updateOreStock(metric.getValue());
            case FOOD_EXTRACTION -> statHolder.updateFoodStock(metric.getValue());
            case WATER_EXTRACTION -> statHolder.updateWaterStock(metric.getValue());
        }
    }
}
