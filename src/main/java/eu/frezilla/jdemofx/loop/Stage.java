package eu.frezilla.jdemofx.loop;

public interface Stage {
    
    void cleanUpAndExit();
    
    boolean continueLoop();
            
    void initialize();
    
    Stage next();
    
    void processInput();
    
    void renderFrame();
    
    void updateGameState();
}