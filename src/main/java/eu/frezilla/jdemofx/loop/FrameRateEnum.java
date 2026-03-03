package eu.frezilla.jdemofx.loop;

public enum FrameRateEnum {
    FPS24(24),
    FPS30(30),
    FPS60(60),
    FPS90(90),
    FPS120(120),
    FPS240(240);
    
    private final double duration;
    private final int fps;
    
    private FrameRateEnum(int fps) {
        this.fps = fps;
        this.duration = 1.0/fps;
    }
    
    public double getDuration() {
        return duration;
    }
    
    public int getFps() {
        return fps;
    }
}
