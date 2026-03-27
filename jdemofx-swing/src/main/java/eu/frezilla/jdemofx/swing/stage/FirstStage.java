package eu.frezilla.jdemofx.swing.stage;

import eu.frezilla.jdemofx.swing.render.Display;
import eu.frezilla.jdemofx.swing.render.config.Configuration;
import eu.frezilla.jdemofx.core.stage.Stage;
import java.util.Objects;
import javax.swing.JFrame;

public final class FirstStage extends AbstractStage {

    private final Stage nextStage;

    public FirstStage(JFrame frame, Configuration configuration, Stage nextStage) {
        super(frame, new Display(configuration));
        this.nextStage = Objects.requireNonNull(nextStage, "L'objet nextStage est absent");
    }

    @Override
    public boolean continueLoop() {
        return true;
    }

    @Override
    public void initialize() {
        super.initialize();
        getFrame().pack();
        getFrame().setLocationRelativeTo(null);
        getFrame().setVisible(true);
    }

    @Override
    public Stage next() {
        return nextStage;
    }
}
