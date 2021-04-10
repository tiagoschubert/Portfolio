import java.util.Scanner;

public class W03dot2 {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Given a year and a month in that year, this program will tell you\n" );
        System.out.print("the number of days in that month.\n" );
        System.out.print("Enter a year:");
        int year = input.nextInt();
        System.out.print("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        int month = input.nextInt();

        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (year >= 0){
            if (month > 0 && month < 13){
                switch (month) {
                    case 1 -> System.out.println(
                            "\nJanuary " + year + " had 31 days");
                    case 2 -> System.out.println("\nFebruary " + year + " has" +
                            ((leapYear) ? " 29 days" : " 28 days in it."));
                    case 3 -> System.out.println(
                            "\nMarch of " + year + " has 31 days in it.");
                    case 4 -> System.out.println(
                            "\nApril of " + year + " has 30 days in it.");
                    case 5 -> System.out.println(
                            "\nMay of " + year + " has 31 days in it.");
                    case 6 -> System.out.println(
                            "\nJune of " + year + " has 30 days in it.");
                    case 7 -> System.out.println(
                            "\nJuly of " + year + " has 31 days in it.");
                    case 8 -> System.out.println(
                            "\nAugust of " + year + " has 31 days in it.");
                    case 9 -> System.out.println(
                            "\nSeptember of " + year + " has 30 days in it.");
                    case 10 -> System.out.println(
                            "\nOctober of " + year + " has 31 days in it.");
                    case 11 -> System.out.println(
                            "\nNovember of " + year + " has 30 days in it.");
                    case 12 -> System.out.println(
                            "\nDecember of " + year + " had 31 days");
                }
            }
            else{System.out.print( month +" is invalid. Month values must be between between 1 and 12, inclusive.");}
        }
        else{System.out.print( year +" is invalid. year values must be positive.");
        }
        System.out.print("\nGoodbye");
    }
}
