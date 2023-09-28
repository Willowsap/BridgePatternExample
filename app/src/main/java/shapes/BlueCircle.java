package shapes;

/**
 * A blue circle.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public class BlueCircle extends Shape
{
    /**
     * Construct a new blue circle using circle as the name.
     */
    public BlueCircle()
    {
        super("circle", "blue", 0x0000ff, new int[]{0, 0, 255});
    }
}
