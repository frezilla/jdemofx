package eu.frezilla.jdemofx.pong;

import eu.frezilla.jdemofx.core.loop.FrameRateEnum;
import eu.frezilla.jdemofx.core.loop.GameLoop;
import eu.frezilla.jdemofx.core.stage.Stage;
import eu.frezilla.jdemofx.pong.stage.title.TitleStage;
import eu.frezilla.jdemofx.swing.render.config.Configuration;
import eu.frezilla.jdemofx.swing.stage.FinalStage;
import eu.frezilla.jdemofx.swing.stage.FirstStage;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JdemofxPong {
    
    public static JFrame createJFrame() {
        JFrame frame = new JFrame("Pong");
        frame.setVisible(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        return frame;
    }

    public static void main(String[] args) {
        Configuration configuration = Configuration.getBuilder().build();
        JFrame frame = createJFrame();
        Stage finalStage = new FinalStage(frame);
        Stage mainStage = new TitleStage(frame, configuration, finalStage);
        Stage firstStage = new FirstStage(frame, configuration, mainStage);
        GameLoop gameLoop = new GameLoop(FrameRateEnum.FPS60, firstStage);
        gameLoop.start();
    }
}
