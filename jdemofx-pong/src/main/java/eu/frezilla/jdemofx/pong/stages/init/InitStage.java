package eu.frezilla.jdemofx.pong.stages.init;

import eu.frezilla.jdemofx.core.loop.Stage;
import eu.frezilla.jdemofx.pong.stages.AbstractStage;
import java.util.Objects;
import javax.swing.JFrame;

public final class InitStage extends AbstractStage {

    private final Stage nextStage;

    public InitStage(JFrame frame, Stage nextStage) {
        super(frame);
        this.nextStage = Objects.requireNonNull(nextStage, "La prochaine étape est absente");
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
