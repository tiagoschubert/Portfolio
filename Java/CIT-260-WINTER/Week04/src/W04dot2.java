import java.util.Scanner;

public class W04dot2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Given your name, hours worked, and hourly wage, this program calculates your
                gross pay, state withholding tax, federal withholding tax, and your net pay.
                It then displays your pay stub.""");
        System.out.print("\nEnter your first and last name: ");
        String name = scanner.next();
        System.out.print("Enter the hours you worked this week: ");
        int hours = scanner.nextInt();
        System.out.print("Enter your hourly wage: ");
        float wage = scanner.nextFloat();

        float gross = hours * wage;

        double state = gross * 0.09;

        double federal = gross * 0.2;

        double net = gross - state - federal;



        System.out.print("\nPay Stub for " + name);
        System.out.print("\nHours Worked: " + hours);
        System.out.print("\nHourly Wage: $" + wage);
        System.out.print("\nGross Pay: $" + String.format("%.2f", gross));
        System.out.print("\nState Tax Withheld: $" + String.format("%.2f",state));
        System.out.print("\nFederal Tax Withheld: $" + String.format("%.2f",federal));
        System.out.print("\nNet Pay: $" + String.format("%.2f",net));
        System.out.println("\nGoodbye!");

    }
}
