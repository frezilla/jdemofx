package eu.frezilla.jdemofx.pong;

import eu.frezilla.jdemofx.loop.Stage;
import eu.frezilla.jdemofx.render.Display;
import eu.frezilla.jdemofx.render.configuration.Configuration;
import javax.swing.JFrame;

public class PStage implements Stage {
    
    private Display display;
    private JFrame frame;

    @Override
    public void cleanUpAndExit() {
        frame.setVisible(false);
        frame.dispose();
    }

    @Override
    public boolean continueLoop() {
        return true;
    }

    @Override
    public void initialize() {
        frame = new JFrame("Pong");
        display = new Display(Configuration.getBuilder().build());
        frame.add(display);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public Stage next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void processInput() {
        
    }

    @Override
    public void renderFrame() {
        display.repaint();
    }

    @Override
    public void updateGameState() {
        
    }
    
}
