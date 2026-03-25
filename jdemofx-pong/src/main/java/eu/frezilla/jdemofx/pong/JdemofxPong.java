package eu.frezilla.jdemofx.pong;

import eu.frezilla.jdemofx.core.loop.FrameRateEnum;
import eu.frezilla.jdemofx.core.loop.GameLoop;
import eu.frezilla.jdemofx.core.loop.Stage;
import eu.frezilla.jdemofx.pong.stages.end.EndStage;
import eu.frezilla.jdemofx.pong.stages.init.InitStage;
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
        JFrame frame = createJFrame();
        Stage initStage = new InitStage(frame, new EndStage(frame));
        GameLoop gameLoop = new GameLoop(FrameRateEnum.FPS24, initStage);
        gameLoop.start();
    }
}
