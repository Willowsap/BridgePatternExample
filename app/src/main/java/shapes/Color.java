package shapes;

/**
 * Abstract color class.
 * 
 * @author Willow Sapphire
 * @version 10/01/2023
 */
public abstract class Color
{
    /**
     * The name of the color of the shape.
     */
    private String name;

    /**
     * The hex code for the color of the shape.
     */
    private int hexcode;

    /**
     * The rgb values for the color of the shape.
     */
    private int[] rgb;

    /**
     * Creates a new color with a given name and values
     * for the color's hexcode and rgb.
     * 
     * @param name the name of the color.
     * @param hexcode the hexcode of the color.
     * @param rgb the rgb values for the color.
     */
    public Color(String name, int hexcode, int[] rgb)
    {
        this.name = name;
        this.hexcode = hexcode;
        this.rgb = rgb;
    }

    /**
     * Accessor method for the color's name.
     * 
     * @return name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Accessor method for the color's hexcode.
     * 
     * @return hexcode.
     */
    public int getHexcode()
    {
        return hexcode;
    }

    /**
     * Accessor method for the color's rgb values.
     * 
     * @return rgb
     */
    public int[] getRgb()
    {
        return rgb;
    }
}
