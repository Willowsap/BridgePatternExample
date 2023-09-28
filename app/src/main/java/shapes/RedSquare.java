package shapes;

/**
 * A red square.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public class RedSquare extends Shape
{
    /**
     * Construct a new red square using square as the name.
     */
    public RedSquare()
    {
        super("square", "red", 0xff0000, new int[]{255, 0, 0});
    }

    /**
     * Describes the square.
     * 
     * @return color and name.
     */
    @Override
    public String description()
    {
        return String.format("A red %s", getName());
    }
}
