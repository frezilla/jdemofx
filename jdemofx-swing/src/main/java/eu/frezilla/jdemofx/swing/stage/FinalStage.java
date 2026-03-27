package eu.frezilla.jdemofx.swing.stage;

import static eu.frezilla.jdemofx.swing.render.DisplayEnum.EMPTY;
import javax.swing.JFrame;

public class FinalStage extends AbstractStage {
    
    public FinalStage(JFrame frame) {
        super(frame, EMPTY.display());
    }
    
}
