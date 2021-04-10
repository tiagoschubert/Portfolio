import java.util.Scanner;

public class W02dot2 {
    public static void main(String[] args) {
        //explain how my program works
        System.out.println("Given the price of a meal and a percentage to use for the tip,");
        System.out.println("this program calculates the tip, the tax, and the total amount of the bill.");

        //ask cost of the meal
        System.out.println("Enter the cost of the meal:");
        Scanner input = new Scanner(System.in);
        double meal = input.nextDouble();

        //ask tip percentage
        System.out.println("Enter the tip percentage:");
        double tip = input.nextDouble();

        //Calculates the total tip and print
        double tipTotal = meal * tip / 100;
        String fTip = String.format("%.2f", tipTotal);
        System.out.println("The tip is $"+ fTip);

        //Calculates the total tax and print
        double tax = meal * 3.2 /100;
        String taxTotal = String.format("%.2f", tax);
        System.out.println("The tax is $"+ taxTotal);

        //Calculates the total bill and print
        double total = meal + tax + tipTotal;
        String fTotal = String.format("%.2f", total);
        System.out.println("The total bill is $"+fTotal);

        System.out.println("Goodbye.");
    }
}
