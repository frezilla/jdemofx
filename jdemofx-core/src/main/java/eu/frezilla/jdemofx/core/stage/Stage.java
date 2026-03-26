package eu.frezilla.jdemofx.core.stage;

public interface Stage {

    default void cleanUpAndExit() {}

    default boolean continueLoop() { return false; }

    default void initialize() {}

    default Stage next() { return null; }

    default void processInput() {}

    default void renderFrame() {}

    default void updateGameState() {}

}
