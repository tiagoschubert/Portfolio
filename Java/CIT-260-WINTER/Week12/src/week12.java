
import java.util.List;
import java.util.ArrayList;

public class week12 {
    /******************************************************************************
     * Your program must do the following:
     * 1 -  Tell the user what the program does.
     * 2 - Create the following objects and store the references to them in a
     *   single ArrayList.
     *      . A Circle object with a radius of 10 inches and an identifier of 156.
     *      . A Square object with a side of 2 inches and an identifier of 237.
     *      . A  Right Triangle with a height of 3 inches, a base of 4 inches and
     *      an identifier of 212.
     * 3 - Iterate through the ArrayList and display the area of the three
     *    different shape objects you have created.
     *
     * @param args arguments
    ******************************************************************************/

    public static void main(String[] args) {

        //Tell the user what the program does
        System.out.println("This program creates several shapes and shows ID and area.\n");

        // create ArrayList
        List<Shape> Shapes = new ArrayList<>();

        // create shapes
        Shapes.add(new Circle(156, 10.0));
        Shapes.add(new Square(237, 2.0));
        Shapes.add(new Triangle(212, 3.0, 4.0));


        //print outputs
        System.out.println("Identifier    Area");
        for (Shape Shape : Shapes) {
            Shape.display();
        }
        System.out.println("\nGoodbye");
    }

}
