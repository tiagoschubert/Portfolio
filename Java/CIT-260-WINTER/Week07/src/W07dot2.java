
public class W07dot2 {
    public static void main(String[] args) {
    ///Tells the use what the program does.
        //Prompts the user to enter five numbers.
        //Saves the user's input in an array of doubles.
        //Uses the methods above to compute the mean and the standard deviation for the numbers in the array.
        //Displays the mean and the standard deviation with 2 digits after the decimal point.
        //Displays a goodbye message.
        //Your file should have the proper file prologue, and each method should have the proper method prologue.


        // SCAN FOR USER INPUT
        java.util.Scanner scan = new java.util.Scanner(System.in);

        // CREATE ARRAY
        double[] x= new double[5];

        // DISPLAY INSTRUCTIONS
        System.out.println("This program computes the mean and the standard deviation for a set of numbers.");

        // FOR LOOP ADDING USER INPUT MY ARRAY
        for (int i = 0; i < x.length; i++) {

            System.out.print("Enter a number: ");
            x[i] = scan.nextDouble();
        }

        // DISPLAY THE MEAN AND DEVIATION
        System.out.printf("The mean of this set of numbers is  %.2f", mean(x));
        System.out.printf("\nThe standard deviation is %.2f", deviation(x));
        System.out.print("\nGoodbye");
    }

    // MEAN METHOD
    public static double mean(double[] x) {
        double sum = 0.0;

        for (double number : x)
            sum += number;

        return sum / x.length;
    }
    // DEVIATION METHOD
    public static double deviation(double[] x) {
        double standardDeviation = 0;
        int length = x.length - 1;
        double mean = mean(x);
        for (double number:x){
            standardDeviation += Math.pow(number - mean, 2);
        }
        return Math.sqrt(standardDeviation / length);

    }

}




