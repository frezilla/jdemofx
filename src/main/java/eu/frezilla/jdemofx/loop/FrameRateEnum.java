package eu.frezilla.jdemofx.loop;

public enum FrameRateEnum {
    FPS24(24),
    FPS30(30),
    FPS60(60),
    FPS90(90),
    FPS120(120),
    FPS240(240);
    
    private final long duration;
    private final int fps;
    
    private FrameRateEnum(int fps) {
        this.fps = fps;
        this.duration = (long) (1.0/fps * 1000000000);
    }
    
    public long getDuration() {
        return duration;
    }
    
    public int getFps() {
        return fps;
    }
}
