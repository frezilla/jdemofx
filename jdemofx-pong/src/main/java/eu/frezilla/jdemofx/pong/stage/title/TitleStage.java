package eu.frezilla.jdemofx.pong.stage.title;

import eu.frezilla.jdemofx.swing.render.config.Configuration;
import eu.frezilla.jdemofx.swing.stage.AbstractStage;
import javax.swing.JFrame;

public class TitleStage extends AbstractStage {
    
    public TitleStage(JFrame frame, Configuration configuration) {
        super(frame, new TitleDisplay(configuration));
    }
    
}
