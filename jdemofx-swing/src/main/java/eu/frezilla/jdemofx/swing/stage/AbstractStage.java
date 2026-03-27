package eu.frezilla.jdemofx.swing.stage;

import eu.frezilla.jdemofx.swing.render.Display;
import eu.frezilla.jdemofx.core.stage.Stage;
import java.util.Objects;
import javax.swing.JFrame;

public abstract class AbstractStage implements Stage {
    
    private final Display display;
    private final JFrame frame;
    
    protected AbstractStage(JFrame frame, Display display) {
        this.display = Objects.requireNonNull(display, "L'objet display est absent");
        this.frame = Objects.requireNonNull(frame, "L'objet frame est absent");
    }
    
    protected final Display getDisplay() {
        return display;
    }
    
    protected final JFrame getFrame() {
        return frame;
    }
    
    @Override
    public void initialize() {
        frame.removeAll();
        frame.add(display);
    }
    
    @Override
    public void renderFrame() {
        display.repaint();
    }
    
}
