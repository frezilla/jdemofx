package eu.frezilla.jdemofx;

public abstract class GameLoop {
    
    public abstract void cleanUpAndExit();
    
    public abstract boolean exitLoop();
    
    public abstract void initializeGameState();
    
    public abstract void processInput();
    
    public abstract void renderFrame();
    
    public final void start() {
        startGame();
        initializeGameState();
        while(!exitLoop()) {
            processInput();
            updateGameState();
            renderFrame();
        }
        cleanUpAndExit();
    }
    
    public abstract void startGame();
    
    public abstract void updateGameState();
}