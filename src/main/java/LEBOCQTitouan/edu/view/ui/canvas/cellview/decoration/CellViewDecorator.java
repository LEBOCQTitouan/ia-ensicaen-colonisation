package LEBOCQTitouan.edu.view.ui.canvas.cellview.decoration;

import LEBOCQTitouan.edu.view.ui.canvas.DisplayableComponent;

import java.awt.*;

public abstract class CellViewDecorator implements DisplayableComponent {
    private final DisplayableComponent wrapped;

    public CellViewDecorator(DisplayableComponent wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void display(Graphics g) {
        wrapped.display(g);
        // TODO: display the decoration
    }
}
