package eu.frezilla.jdemofx.core.stage;

public interface Stage {

    default void cleanUpAndExit() {}

    default void initialize() {}
    
    default boolean loop() { return false; }

    default Stage next() { return null; }

    default void processInput() {}

    default void renderFrame() {}

    default void updateGameState() {}

}
