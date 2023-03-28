package LEBOCQTitouan.edu.view;

import LEBOCQTitouan.edu.presenter.SimulationPresenter;

import javax.swing.*;

public class AppWindow extends JFrame {
    private SimulationPresenter presenter;
    private void initContent() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("Test callback");
        button.addActionListener(e -> {
            if (presenter != null) {
                // TODO
                System.out.println("Test callback");
            }
        });
        panel.add(button);

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
}
