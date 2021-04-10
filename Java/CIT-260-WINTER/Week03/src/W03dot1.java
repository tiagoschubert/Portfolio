import java.util.Scanner;

public class W03dot1 {
    public static void main (String[]args){
        // write your code here
        Scanner in = new Scanner(System.in);

        System.out.print("Given today's day of the week and some number of days in the future\n");
        System.out.print("this program will tell you the day of the week for the future day.\n");
        System.out.print("Enter today's day of the week (0 for Sunday, 1 for Monday, etc...): \n");
        int date = in.nextInt();
        System.out.print("Enter the number of days in the future:");
        int future = in.nextInt();


        int future_date = (date + future) % 7;
        String day_of_week = switch (date) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "";
        };

        if (date >= 0 && date < 7) {
            if (future > 0) {
                if (future_date == 0) {
                    System.out.printf("Today is %s and the future day is Sunday.", day_of_week);
                } else if (future_date == 1) {
                    System.out.printf("Today is %s and the future day is Monday.", day_of_week);
                } else if (future_date == 2) {
                    System.out.printf("Today is %s and the future day is Tuesday.", day_of_week);
                } else if (future_date == 3) {
                    System.out.printf("Today is %s and the future day is Wednesday.", day_of_week);
                } else if (future_date == 4) {
                    System.out.printf("Today is %s and the future day is Thursday.", day_of_week);
                } else if (future_date == 5) {
                    System.out.printf("Today is %s and the future day is Friday.", day_of_week);
                } else if (future_date == 6) {
                    System.out.printf("Today is %s and the future day is Saturday.", day_of_week);
                }
            }
            else {
                System.out.print(future + " is invalid. You must enter a positive number.");
            }
        }
        else {
            System.out.print(date + " is invalid. You must enter a positive number, between 0 and 6.");
        }
        System.out.print("\nGoodbye.");

    }

}
