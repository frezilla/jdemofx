package eu.frezilla.jdemofx.core.render.config;

import eu.frezilla.jdemofx.core.render.ImageType;
import eu.frezilla.jdemofx.core.render.Size;
import java.awt.Color;
import java.util.Objects;

/**
 * La class {@code Configuration} stocke les informations nécessaires à la
 * configuration de la zone d'affichage.
 *
 * <p>
 * Les paramètres de la {@code Configuration} sont les suivants :
 * <ul>
 * <li>Le type de l'image (valeur non null)</li>
 * <li>La taille (valeur non nulle)</li>
 * <li>La couleur d'arrière plan</li>
 * </ul>
 *
 * <p>
 * Une {@code Configuration} est immuable; elle est créée via l'utilisation d'un
 * {@code Builder} créé par l'appel à la méthode
 * {@link Configuration#getBuilder()}.
 *
 * @see Builder
 */
public class Configuration {

    private final Color backgroundColor;
    private final ImageType imageType;
    private final Size size;

    Configuration(Color backgroundColor, ImageType imageType, Size size) {
        this.backgroundColor = Objects.requireNonNull(backgroundColor, "La couleur de l'arrière plan n'est pas correctement définie");
        this.imageType = Objects.requireNonNull(imageType, "Le type de l'image n'est pas correctement défini");
        this.size = Objects.requireNonNull(size, "la taille n'est pas correctement définie");
    }

    /**
     * Retourne la couleur de fond de la zone d'affichage.
     *
     * @return Couleur du fond
     * @see Color
     */
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Créé une instance {@code Builder} nécessaire à la création d'une
     * {@code Configuration}.
     *
     * @return {@code Builder}
     * @see Builder
     */
    public static Builder getBuilder() {
        return new Builder();
    }

    /**
     * Retourne le type de l'image.
     *
     * @return Type de l'image
     * @see ImageType
     */
    public ImageType getImageType() {
        return imageType;
    }

    /**
     * Retourne la taille configuré.
     *
     * @return Taille
     * @see Size
     */
    public Size getSize() {
        return size;
    }

}
