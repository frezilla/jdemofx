package eu.frezilla.jdemofx.core.loop;

import java.time.Duration;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameLoop {

    private static final Logger LOGGER = LoggerFactory.getLogger(GameLoop.class);

    private final FrameRateEnum frameRate;
    private final Stage stage;

    public GameLoop(FrameRateEnum frameRate, Stage stage) {
        this.frameRate = Objects.requireNonNull(frameRate, "frameRate is null");
        this.stage = new Stage() {
            @Override
            public Stage next() {
                return stage;
            }
        };
    }

    public int getCurrentFps() {
        return frameRate.getFps();
    }

    public void start() {
        LOGGER.trace("Start game loop");

        Stage currentStage = stage;
        while ((currentStage = currentStage.next()) != null) {

            LOGGER.trace("Initialize");
            currentStage.initialize();

            while (currentStage.continueLoop()) {
                long startTime = System.nanoTime();

                LOGGER.trace("Process input");
                currentStage.processInput();

                LOGGER.trace("Update game state");
                currentStage.updateGameState();

                LOGGER.trace("Render frame");
                currentStage.renderFrame();

                long elapsedTime = System.nanoTime() - startTime;
                long sleepTime = frameRate.getDuration() - elapsedTime;
                if (sleepTime > 0) {
                    try {
                        Thread.sleep(Duration.ofNanos(sleepTime));
                    } catch (InterruptedException e) {
                        LOGGER.warn("Pause thread in game loop interrupted", e);
                        Thread.currentThread().interrupt();
                    }
                }
            }

            LOGGER.trace("Clean up and exit");
            currentStage.cleanUpAndExit();
        }

        LOGGER.trace("Game loop completed");
    }

}
