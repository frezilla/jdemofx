package eu.frezilla.jdemofx.pong.stage.title;

import eu.frezilla.jdemofx.core.stage.Stage;
import eu.frezilla.jdemofx.swing.render.config.Configuration;
import eu.frezilla.jdemofx.swing.stage.AbstractStage;
import javax.swing.JFrame;

public class TitleStage extends AbstractStage {
    
    private final Stage nextStage;
    
    public TitleStage(JFrame frame, Configuration configuration, Stage nextStage) {
        super(frame, new TitleDisplay(configuration));
        this.nextStage = nextStage;
    }
    
    @Override
    public boolean loop() {
        return true;
    }
    
    @Override
    public Stage next() { 
        return nextStage; 
    }
    
}
