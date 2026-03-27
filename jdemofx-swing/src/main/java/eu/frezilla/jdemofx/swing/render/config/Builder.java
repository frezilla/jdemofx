package eu.frezilla.jdemofx.swing.render.config;

import eu.frezilla.jdemofx.swing.render.ImageType;
import eu.frezilla.jdemofx.swing.render.Size;
import eu.frezilla.jdemofx.swing.render.Sizes;
import java.awt.Color;

/**
 * La classe {@code Builder} permet de créer une instance de la classe
 * {@Configuration}.
 *
 * <p>
 * Les valeurs par défaut sont les suivantes :
 * <ul>
 * <li>Couleur de l'arrière plan : {@link Color#black}</li>
 * <li>Type de l'image : {@link ImageType#TYPE_INT_RGB}</li>
 * <li>Taille : {@link Sizes#HIGH}</li>
 * </ul>
 *
 * @see Configuration
 * @see Sizes
 */
public class Builder {
    
    private Color backgroundColor;
    private ImageType imageType;
    private Size size;

    Builder() {
        backgroundColor = Color.black;
        imageType = ImageType.TYPE_INT_RGB;
        size = Sizes.HIGH.getSize();
    }

    /**
     * Créé une nouvelle {@code Configuration} à partir des paramètres définis.
     *
     * @return Nouvelle instance de la classe {@code Configuration}
     * @see Configuration
     */
    public Configuration build() {
        return new Configuration(backgroundColor, imageType, size);
    }
    
    /**
     * Défini la couleur de l'arrière plan.
     * 
     * @param color Couleur
     * @return {@code Builder} courant
     * @see Color
     */
    public Builder backgroundColor(Color color) {
        this.backgroundColor = color;
        return this;
    }
    
    /**
     * Définit le type de l'image.
     * 
     * @param imageType Type de l'image
     * @return {@code Builder} courant
     * @see ImageType
     */
    public Builder imageType(ImageType imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * Définit la taille.
     *
     * @param size Taille
     * @return {@code Builder} courant
     * @see Size
     */
    public Builder size(Size size) {
        this.size = size;
        return this;
    }
    
}
