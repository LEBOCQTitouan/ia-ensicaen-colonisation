package LEBOCQTitouan.edu.view.ui.canvas.cellview;

import LEBOCQTitouan.edu.view.ui.canvas.DisplayableComponent;

import java.awt.*;

public class CellView implements DisplayableComponent {
    public static int CELL_SIZE = 10;
    private final int x;
    private final int y;

    public CellView(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void display(Graphics g) {

    }
}
