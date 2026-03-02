package eu.frezilla.jdemofx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class GameLoop {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(GameLoop.class);
    
    public abstract void cleanUpAndExit();
    
    public abstract boolean exitLoop();
    
    public abstract void initializeGameState();
    
    public abstract void processInput();
    
    public abstract void renderFrame();
    
    public final void start() {
        LOGGER.trace("start game");
        startGame();
        
        LOGGER.trace("intialize game");
        initializeGameState();
        
        LOGGER.trace("start loop");
        while(!exitLoop()) {
            LOGGER.trace("process input");
            processInput();
            
            LOGGER.debug("update game state");
            updateGameState();
            
            LOGGER.debug("renfer frame");
            renderFrame();
        }
        LOGGER.trace("exit loop");
        
        LOGGER.trace("cleanup and exot");
        cleanUpAndExit();
    }
    
    public abstract void startGame();
    
    public abstract void updateGameState();
}