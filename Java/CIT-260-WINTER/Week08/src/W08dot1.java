import java.text.DecimalFormat;

public class W08dot1 {
    public static void main(String[] args) {
        ///. Tells the user what the program does.
        //. Creates two Rectangle objects, the first with a height of 4 and a width of 40, the second with a height
        // of 3.5 and a width of 5.
        //. Call the methods in your Rectangle class to output the width, height, area, and perimeter of each rectangle,
        // with 2 digits after the decimal point.
        //. Output a goodbye message.

        //formatting with 2 digits
        DecimalFormat f = new DecimalFormat("##.00");

        // Create a Rectangle with width 4 and height 40
        Rectangle rectangle1 = new Rectangle(4.0, 40);

        // Create a Rectangle with width 5 and height 3.5
        Rectangle rectangle2 = new Rectangle(5.0, 3.5);


        // Display the width, height, area, and perimeter of Rectangle1
        System.out.println("\n Rectangle 1");
        System.out.println("-------------");
        System.out.println("Width:     " + f.format(rectangle1.width));
        System.out.println("Height:    " + f.format(rectangle1.height));
        System.out.println("Area:      " + f.format(rectangle1.getArea()));
        System.out.println("Perimeter: " + f.format(rectangle1.getPerimeter()));

        // Display the width, height, area, and perimeter of Rectangle2
        System.out.println("\n Rectangle 2");
        System.out.println("-------------");
        System.out.println("Width:     " + f.format(rectangle2.width));
        System.out.println("Height:    " + f.format(rectangle2.height));
        System.out.println("Area:      " + f.format(rectangle2.getArea()));
        System.out.println("Perimeter: " + f.format(rectangle2.getPerimeter()));
        System.out.println("Goodbye");
    }

// Define the Rectangle class
    public static class Rectangle {
        double width ;	// Width of rectangle
        double height ;	// Height of rectangle

        /** A no-arg constructor that creates a default rectangle */
        Rectangle() {
            width = 1;
            height = 1;
        }

        /** A constructor that creates a rectangle
         with the specified width and height    */
        Rectangle(double newWidth, double newHeight) {
            width = newWidth;
            height = newHeight;
        }

        /** Return the area of this rectangle */
        double getArea() {
            return width * height;
        }

        /** Return the perimeter of this rectangle */
        double getPerimeter() {
            return 2 * (width + height);
        }

    }
}
