import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

public class Week13 {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>(); // ArrayList to hold Shape references
        // creating Circle object
        Circle circleObject = new Circle(156, "(1,1)", 10);

        // creating Square object
        Square squareObject = new Square(237, "(1,3)", 2);

        // creating Triangle object
        Triangle triangleObject = new Triangle(212, "(3,3)", 4, 3);

        // adding all three objects to array list shapes
        shapes.add(circleObject);
        shapes.add(squareObject);
        shapes.add(triangleObject);

        // writing objects to file shapes.txt
        try {
            FileWriter filewrite = new FileWriter("shapes.txt");
            for (Shape shape : shapes) {
                // wrting each shape appropriately according to its underneath type
                if (shape.getName().compareTo("Circle") == 0) {
                    filewrite.write(((Circle) shape).toString() + "\n");
                } else if (shape.getName().compareTo("Square") == 0) {
                    filewrite.write(((Square) shape).toString() + "\n");
                } else if (shape.getName().compareTo("Triangle") == 0) {
                    filewrite.write(((Triangle) shape).toString() + "\n");
                }
            }
            
            filewrite.close(); // closing writer
        } catch (IOException e) {
            System.out.println("A error occurred while writing to file.");
            e.printStackTrace();
        }

        // reading data from previously created file shapes.txt
        try {
            File file = new File("shapes.txt");
            Scanner filereader = new Scanner(file); // setting file reader
            String name;
            int id;
            String position;
            double value1, value2;
            System.out.printf("%15s\t%10s\t%15s\t%15s\n", "Shape", "ID", "Position", "Area");
            while (filereader.hasNextLine()) {

                // read until file has a next line
                if (!filereader.hasNext())
                    break;
                name = filereader.next(); // read shape name first

                // check which type of shape is this and create object of that particular shape
                if (name.compareTo("Circle") == 0) {
                    
                    // if shape name is circle
                    // read from file for circle object
                    id = filereader.nextInt();
                    position = filereader.next();
                    value1 = filereader.nextDouble();
                    Circle c = new Circle(id, position, value1);
                    System.out.printf("%15s\t%10d\t%15s\t%15.2f\n", circleObject.getName(), circleObject.getId(), circleObject.getPosition(),
                            circleObject.calculateArea());
                } else if (name.compareTo("Square") == 0) {

                    // if shape name is square
                    // read from file for Square object
                    id = filereader.nextInt();
                    position = filereader.next();
                    value1 = filereader.nextDouble();
                    Square s = new Square(id, position, value1);
                    System.out.printf("%15s\t%10d\t%15s\t%15.2f\n", squareObject.getName(), squareObject.getId(), squareObject.getPosition(),
                            squareObject.calculateArea());
                } else if (name.compareTo("Triangle") == 0) {

                    // if shape name is triangle
                    // read from file for Triangle object
                    id = filereader.nextInt();
                    position = filereader.next();
                    value1 = filereader.nextDouble();
                    value2 = filereader.nextDouble();
                    Triangle t = new Triangle(id, position, value1, value2);
                    System.out.printf("%15s\t%10d\t%15s\t%15.2f\n", triangleObject.getName(), triangleObject.getId(), triangleObject.getPosition(),
                            t.calculateArea());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. :O");
            e.printStackTrace();
        }
    }
}
