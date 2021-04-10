
public class W07dot1 {
    public static void main(String[] args) {
    ///Tells the user what the program does.
        //Prompts the user to enter 5 double values.
        //Stores these values in an array.
        //Calls the average method you wrote to calculate and return the average value of the numbers in the array.
        //Displays the average value, with two digits after the decimal point.
        //Displays a goodbye message.

        // SCAN FOR USER INPUT
        java.util.Scanner in = new java.util.Scanner(System.in);

        // CREATE ARRAY
        double[] numbers = new double[5];

        // DISPLAY INSTRUCTIONS
        System.out.println("This program calculates the average of five numbers.");

        // FOR LOOP ADDING USER INPUT MY ARRAY
        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter a number: ");
            numbers[i] = in.nextDouble();
        }

        // DISPLAY AVERAGE
        System.out.printf("The average of these five numbers is  %.2f", average(numbers));
        System.out.print("\nGoodbye");
    }

    // AVERAGE METHOD
    public static double average(double[] array) {
        double sum = 0.0;

        for (double number : array)
            sum += number;

        return sum / array.length;
    }

    }




