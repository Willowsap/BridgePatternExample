package client;

import java.util.ArrayList;

import shapes.Blue;
import shapes.Red;
import shapes.Circle;
import shapes.Square;
import shapes.Triangle;
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
        shapes.add(new Circle(new Blue()));
        shapes.add(new Square(new Blue()));
        shapes.add(new Triangle(new Blue()));
        shapes.add(new Circle(new Red()));
        shapes.add(new Square(new Red()));
        shapes.add(new Triangle(new Red()));

        for (Shape shape : shapes)
        {
            System.out.println(shape.description());
        }
    }
}
