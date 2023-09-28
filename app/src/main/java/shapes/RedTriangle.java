package shapes;

/**
 * A red triangle.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public class RedTriangle extends Shape
{
    /**
     * Construct a new red triangle using triangle as the name.
     */
    public RedTriangle()
    {
        super("triangle", "red", 0xff0000, new int[]{255, 0, 0});
    }

    /**
     * Describes the triangle.
     * 
     * @return color and name.
     */
    @Override
    public String description()
    {
        return String.format("A red %s", getName());
    }
}
