package eu.frezilla.jdemofx.pong.stages;

import eu.frezilla.jdemofx.core.stage.Stage;
import eu.frezilla.jdemofx.core.render.Display;
import eu.frezilla.jdemofx.core.render.config.Configuration;
import java.util.Objects;
import javax.swing.JFrame;

public abstract class AbstractStage implements Stage {
    
    private final Display display;
    private final JFrame frame;
    
    protected AbstractStage(JFrame frame) {
        this.display = new Display(Configuration.getBuilder().build());
        this.frame = Objects.requireNonNull(frame, "L'objet frame est absent");
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
