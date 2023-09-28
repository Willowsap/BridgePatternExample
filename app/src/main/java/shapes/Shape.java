package shapes;

/**
 * Abstract shape implementation.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public abstract class Shape
{
    /**
     * The name of the color of the shape.
     */
    private String color;

    /**
     * The hex code for the color of the shape.
     */
    private int colorHexcode;

    /**
     * The rgb values for the color of the shape.
     */
    private int[] colorRgb;

    /**
     * The name of the shape.
     */
    private String name;

    /**
     * Creates a new shape.
     * 
     * @param name the name of the shape.
     */
    public Shape(String name, String color, int hexcode, int[] rgb)
    {
        this.name = name;
        this.color = color;
        this.colorHexcode = hexcode;
        this.colorRgb = rgb;
    }

    /**
     * Accessor method for name.
     * 
     * @return name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Accessor method for the name of the color.
     * 
     * @return color.
     */
    public String getColor()
    {
        return color;
    }

    /**
     * Accessor method for the color hexcode.
     * 
     * @return colorHexcode.
     */
    public int getColorHexcode()
    {
        return colorHexcode;
    }

    /**
     * Accessor method for the color rgb values.
     * 
     * @return colorRgb.
     */
    public int[] getColorRgb()
    {
        return colorRgb;
    }

    /**
     * Outputs a description of the shape.
     * 
     * @return a description of the shape.
     */
    public String description()
    {
        return String.format("A %s %s", color, name);
    }
}
