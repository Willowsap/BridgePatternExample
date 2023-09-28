package shapes;

/**
 * A blue square.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public class BlueSquare extends Shape
{
    /**
     * Construct a new blue square using square as the name.
     */
    public BlueSquare()
    {
        super("square", "blue", 0x0000ff, new int[]{0, 0, 255});
    }

    /**
     * Describes the square.
     * 
     * @return color and name.
     */
    @Override
    public String description()
    {
        return String.format("A blue %s", getName());
    }
}
