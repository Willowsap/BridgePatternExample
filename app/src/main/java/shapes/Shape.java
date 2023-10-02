package shapes;

/**
 * Abstract shape implementation.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public abstract class Shape
{

    private Color color;

    /**
     * The name of the shape.
     */
    private String name;

    /**
     * Creates a new shape.
     * 
     * @param name the name of the shape.
     */
    public Shape(String name, Color color)
    {
        this.name = name;
        this.color = color;
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
    public Color getColor()
    {
        return color;
    }

    /**
     * Outputs a description of the shape.
     * 
     * @return a description of the shape.
     */
    public String description()
    {
        return String.format("A %s %s", color.getName(), name);
    }
}
