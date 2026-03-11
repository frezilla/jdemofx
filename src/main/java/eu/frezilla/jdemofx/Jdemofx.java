package eu.frezilla.jdemofx;

import eu.frezilla.jdemofx.loop.FrameRateEnum;
import eu.frezilla.jdemofx.loop.GameLoop;
import eu.frezilla.jdemofx.pong.PStage;

public class Jdemofx {

    public static void main(String[] args) {
        GameLoop gameLoop = new GameLoop(FrameRateEnum.FPS60, new PStage());
        gameLoop.start();
    }
}
