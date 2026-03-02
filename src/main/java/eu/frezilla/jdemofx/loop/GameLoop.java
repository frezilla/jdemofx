package eu.frezilla.jdemofx.loop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class GameLoop {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(GameLoop.class);
    
    protected abstract void cleanUpAndExit();
    
    protected abstract boolean exitLoop();
    
    protected abstract void initializeGameState();
    
    protected abstract void processInput();
    
    protected abstract void renderFrame();
    
    public final void start() {
        LOGGER.trace("Start game");
        startGame();
        
        LOGGER.trace("Initialize game state");
        initializeGameState();
        while(!exitLoop()) {
            LOGGER.trace("Process input");
            processInput();
            
            LOGGER.trace("Update game state");
            updateGameState();
            
            LOGGER.trace("Render frame");
            renderFrame();
        }
        
        LOGGER.trace("Clean up and exit");
        cleanUpAndExit();
    }
    
    protected abstract void startGame();
    
    protected abstract void updateGameState();
}