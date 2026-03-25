package eu.frezilla.jdemofx.core.render;

import eu.frezilla.jdemofx.core.render.config.Configuration;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Objects;
import javax.swing.JPanel;

public class Display extends JPanel {
    
    private transient BufferedImage image;
    
    public Display(Configuration configuration) {
        Objects.requireNonNull(configuration, "La configuration est absente");
        setBackground(configuration.getBackgroundColor());
        setPreferredSize(configuration.getSize().toDimension());
        image = new BufferedImage(configuration.getSize().getWidth(), configuration.getSize().getHeight(), ImageType.TYPE_INT_RGB.intValue());
        Graphics2D g = image.createGraphics();
        g.setBackground(configuration.getBackgroundColor());
        g.setColor(configuration.getBackgroundColor());
        g.fillRect(0, 0, configuration.getSize().getWidth(), configuration.getSize().getHeight());
        g.dispose();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        if (image != null) {
            g.drawImage(image, 0, 0, null);
        }
    }
    
    public void setImage(BufferedImage img) {
        this.image = Objects.requireNonNull(img, "L'image à afficher est absente");
    }
    
}
