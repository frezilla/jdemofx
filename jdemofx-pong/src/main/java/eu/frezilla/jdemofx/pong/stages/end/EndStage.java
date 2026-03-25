package eu.frezilla.jdemofx.pong.stages.end;

import eu.frezilla.jdemofx.pong.stages.AbstractStage;
import javax.swing.JFrame;


public final class EndStage extends AbstractStage {
    
    public EndStage(JFrame frame) {
        super(frame);
    }
    
    @Override
    public void cleanUpAndExit() {
        getFrame().setVisible(true);
        getFrame().dispose();
    }
    
    @Override
    public boolean continueLoop() {
        return false;
    }
    
}
