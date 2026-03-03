package eu.frezilla.jdemofx;

import eu.frezilla.jdemofx.loop.FrameRateEnum;
import eu.frezilla.jdemofx.loop.GameLoop;

public class GameLoopImpl extends GameLoop {

    public GameLoopImpl() {
        super(FrameRateEnum.FPS24);
    }

    @Override
    public void cleanUpAndExit() {
        }

    @Override
    public boolean exitLoop() {
        return false;
        }

    @Override
    public void initializeGameState() {
        }

    @Override
    public void processInput() {
        }

    @Override
    public void renderFrame() {
        }

    @Override
    public void startGame() {
        }

    @Override
    public void updateGameState() {
        }
    
}
