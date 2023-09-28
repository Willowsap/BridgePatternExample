package client;

import java.util.ArrayList;

import shapes.BlueCircle;
import shapes.BlueSquare;
import shapes.BlueTriangle;
import shapes.RedCircle;
import shapes.RedSquare;
import shapes.RedTriangle;
import shapes.Shape;

/**
 * A simple demo class showing the shapes.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public class Demo
{
    /**
     * Runs the demo.
     * 
     * @param args unused.
     */
    public static void main(String[] args)
    {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new BlueCircle());
        shapes.add(new BlueSquare());
        shapes.add(new BlueTriangle());
        shapes.add(new RedCircle());
        shapes.add(new RedSquare());
        shapes.add(new RedTriangle());

        for (Shape shape : shapes)
        {
            System.out.println(shape.description());
        }
    }
}
