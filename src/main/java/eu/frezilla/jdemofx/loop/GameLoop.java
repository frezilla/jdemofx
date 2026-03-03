package eu.frezilla.jdemofx.loop;

import java.time.Duration;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class GameLoop {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(GameLoop.class);
    
    private final FrameRateEnum frameRate;
    
    public GameLoop(FrameRateEnum frameRate) {
        this.frameRate = Objects.requireNonNull(frameRate, "frameRate is null");
    }
    
    protected abstract void cleanUpAndExit();
    
    protected abstract boolean exitLoop();
    
    public final int getCurrentFps() {
        return frameRate.getFps();
    }
    
    protected abstract void initializeGameState();
    
    protected abstract void processInput();
    
    protected abstract void renderFrame();
    
    public final void start() {
        LOGGER.trace("Start game");
        startGame();
        
        LOGGER.trace("Initialize game state");
        initializeGameState();
        
        while(!exitLoop()) {
            long startTime = System.nanoTime();
            
            LOGGER.trace("Process input");
            processInput();
            
            LOGGER.trace("Update game state");
            updateGameState();
            
            LOGGER.trace("Render frame");
            renderFrame();
            
            long elapsedTime = System.nanoTime() - startTime;
            long sleepTime = frameRate.getDuration() - elapsedTime;
            if (sleepTime > 0) {
                try {
                    Thread.sleep(Duration.ofNanos(sleepTime));
                } catch (InterruptedException e) {
                    LOGGER.warn("Pause thread in game loop interrupted", e);
                }
            }
        }
        
        LOGGER.trace("Clean up and exit");
        cleanUpAndExit();
    }
    
    protected abstract void startGame();
    
    protected abstract void updateGameState();
}