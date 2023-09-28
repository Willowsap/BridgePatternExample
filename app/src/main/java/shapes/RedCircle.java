package shapes;

/**
 * A red circle.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public class RedCircle extends Shape
{
    /**
     * Construct a new red circle using circle as the name.
     */
    public RedCircle()
    {
        super("circle", "red", 0xff0000, new int[]{255, 0, 0});
    }

    /**
     * Describes the circle.
     * 
     * @return color and name.
     */
    @Override
    public String description()
    {
        return String.format("A red %s", getName());
    }
}
