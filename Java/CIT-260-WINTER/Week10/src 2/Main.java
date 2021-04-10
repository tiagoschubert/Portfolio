
/**************************
 * - color:string         *
 * - side1:double         *
 * - side2:double         *
 * - side3:double         *
 * - filled:boolean       *
 *------------------------*
 * + getSide():double     *
 * + getFilled():boolean  *
 *************************/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // tell the user what the program do
        System.out.println("\nThis program gets input for a triangle from the user.");
        System.out.println("It then creates a Triangle object and displays its description.");

        // Prompt the user to enter a color
        System.out.print("\nEnter the color of the triangle (e.g. red): ");
        String inputColor = input.next();

        // Prompt the user to enter whether the triangle is filled
        System.out.print("\nIs the triangle filled (y or n): ");
        boolean filled = getFilled();

        // Prompt the user to enter three sides of the triangle
        System.out.println("\nEnter the non-zero, positive lengths of the three sides of the triangle: ");
        double side1 = getAllSides();
        double side2 = getAllSides();
        double side3 = getAllSides();

        // Create triangle object with user input
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(inputColor);
        triangle.setFilled(filled);

        // Print Output
        System.out.print("\nTriangle Output:");
        System.out.println(triangle.toString());
    }
    /** get just positive non-zero side */
    private static double getAllSides(){
        Scanner input = new Scanner(System.in);

        while (true){
            double inputSide = input.nextDouble();

            if (inputSide > 0) {
                return inputSide;
            }
            else {
                System.out.println("Invalid input. Please enter just positive length");
            }
        }
    }

    /** Get filled yes or no with y or n */
    private static boolean getFilled(){
        Scanner input = new Scanner(System.in);

        while (true){
            String inputFilled = input.next();

            int inputLenght = inputFilled.length();

            if (inputLenght == 1){

                if ((inputFilled.equals("y")) || (inputFilled.equals("n"))){
                    return inputFilled.equals("y");
                } else {
                    System.out.println("Answer only Y or N.");
                }
            }
            else {
                System.out.println("Answer only Y or N.");
            }
        }
    }
}
