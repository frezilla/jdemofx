package eu.frezilla.jdemofx;

import eu.frezilla.jdemofx.loop.GameLoop;

public class Jdemofx {

    public static void main(String[] args) {
        GameLoop gameLoop = new GameLoopImpl();
        gameLoop.start();
    }
}
