
import java.util.Scanner;

public class W09 {

    public static void main(String[] args) {
        // 1. Tells the user what the program does.
        System.out.println("This program creates a point at (0,0) and a point at the coordinates");
        System.out.println("entered by you. It then computes and displays the distance from (0,0)");
        System.out.println("to the point defined by you, using three different methods.");

        // scanner
        Scanner keyboard = new Scanner(System.in);

        // 2. Uses the no-arg constructor to create a MyPoint object p1 at (0,0).
        MyPoint p1 = new MyPoint();

        // 3. Prompts the user to enter the x and y coordinates of a point.
        // 4. Saves the users input.
        System.out.print("Enter the x coordinate of a point: ");
        int x = Integer.parseInt(keyboard.next());

        System.out.print("Enter the y coordinate of a point: ");
        int y = Integer.parseInt(keyboard.next());

        // Uses the arg constructor to create a MyPoint object p2 at (3,4).  Needed for methods 2 & 3.
        MyPoint p2 = new MyPoint(x, y);

        // 5. Uses the first distance method to calculate and display the distance between the MyPoint object p1
        //    and the point at the x and y coordinates entered by the user. The distance is displayed with two digits
        //    after the decimal point.
        System.out.println("Using method 1, the distance " +
                "from (" + p1.getX() + "," + p1.getY() + ") " +
                "to (" + p2.getX() + "," + p2.getY() + ") is " +
                String.format("%.2f", p1.distance(p2.getX(), p2.getY())) );

        // 6. Uses the parameterized constructor to create a MyPoint object p2 using the x coordinate and y
        //    coordinate entered by the user.
        System.out.println("Using method 2, the distance " +
                "from (" + p1.getX() + "," + p1.getY() + ") " +
                "to (" + p2.getX() + "," + p2.getY() + ") is " +
                String.format("%.2f", p1.distance(p2)) );

        // 7. Uses the second and third distance method to calculate and display the distance between the
        //    MyPoint object p1 and the MyPoint object p2. The distance is displayed with two digits after the
        //    decimal point.
        System.out.println("Using method 3, the distance " +
                "from (" + p1.getX() + "," + p1.getY() + ") " +
                "to (" + p2.getX() + "," + p2.getY() + ") is " +
                String.format("%.2f", p1.distance(p1, p2)) );

        // 8. Displays a goodbye message.
        System.out.print("Goodbye ...");
    }
}
