package eu.frezilla.jdemofx.swing.render;

import eu.frezilla.jdemofx.swing.render.config.Configuration;

public enum DisplayEnum {
    DEFAULT(Configuration.getBuilder().build()),
    EMPTY(Configuration.getBuilder().size(new Size(0, 0)).build());
    
    private final Display display;
    
    private DisplayEnum(Configuration configuration) {
        display = new Display(configuration);
    }
    
    public Display display() {
        return display;
    };
    
}
