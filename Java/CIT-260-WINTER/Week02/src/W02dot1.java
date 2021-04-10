import java.util.Scanner;

public class W02dot1 {
    public static void main(String[] args) {
        // explain how this program works.
        System.out.println("This program converts a temperature in degrees Celsius into \n");
        System.out.println("a temperature in degrees Fahrenheit.\n");

        //ask the temperature in Celsius
        System.out.println("Enter a temperature in\n" + "degrees Celsius:");
        Scanner input = new Scanner(System.in);
        double Cel = input.nextDouble();

        // convert Celsius in Fahrenheit
        double Fah = 1.8 * Cel + 32;

        //format 2 decimals digits
        String Celsius = String.format("%.2f", Cel);
        String Fahrenheit = String.format("%.2f", Fah);

        //print results
        System.out.println(Celsius +" degrees Celsius is equal to " + Fahrenheit + " degrees Fahrenheit.\n" + "Goodbye. ");
    }
}
