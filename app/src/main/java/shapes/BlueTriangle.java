package shapes;

/**
 * A blue triangle.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public class BlueTriangle extends Shape
{
    /**
     * Construct a new blue triangle using triangle as the name.
     */
    public BlueTriangle()
    {
        super("triangle", "blue", 0x0000ff, new int[]{0, 0, 255});
    }

    /**
     * Describes the triangle.
     * 
     * @return color and name.
     */
    @Override
    public String description()
    {
        return String.format("A blue %s", getName());
    }
}
