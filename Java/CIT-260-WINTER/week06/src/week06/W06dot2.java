package week06;

public class W06dot2 {

    public static void main(String[] args)
    {
        // Display table
        System.out.println("┌────────────┬────────────┬────────────┬────────────┐" );
        System.out.println("|   Celsius  | Fahrenheit | Fahrenheit |   Celsius  |" );
        System.out.println("└────────────┴────────────┴────────────┴────────────┘");

        // Display data
        for (double tempCelsius = 40.0, fahrenheit = 120.0;
             tempCelsius >= 31.0; tempCelsius--, fahrenheit -= 10)
        {
            System.out.printf("|    %-9.1f ", tempCelsius);
            System.out.printf("%-11.1f|", celsiusToFahrenheit(tempCelsius));
            System.out.printf(" %-11.1f", fahrenheit);
            System.out.printf("    %-6.2f   |\n", fahrenheitToCelsius(fahrenheit));

        }
        System.out.println("└───────────────────────────────────────────────────┘");

        System.out.println("Goodbye");
    }

    /** Convert Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double tempCelsius)
    {
        return (9.0 / 5) * tempCelsius + 32;
    }

    /** Convert Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double tempFahrenheit)
    {
        return (5.0 / 9) * (tempFahrenheit - 32);
    }
}
