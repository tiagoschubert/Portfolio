package week06;

import java.util.Scanner;

public class W06dot1 {

    public static void main(String[] args) {
        /**
         * Future Value of Investment
         * @param investmentAmount principle amount invested
         * @param monthlyInterestRate monthly interest rate
         * @param years number of years to keep the investment
         * @return the future investment amount as a double
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Given an investment amount and an annual interest rate, this program \n" );
                System.out.print("will calculate the future value of the investment for a period of\n" );
        System.out.println("ten years. ");
        System.out.println("Enter the a positive, non-zero value for the investment: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter an annual interest rate, between 0 and 100: ");
        double monthlyInterestRate = input.nextDouble();
        int year = 10;
        monthlyInterestRate *= 0.01;

        System.out.println("Years    FutureValue");
        for (int i = 1; i <= year; i++) {
            int formatter = 19;
            if (i >= 10)formatter = 18;
            System.out.printf(i + "%" +formatter+".2f\n", future_value(investmentAmount, monthlyInterestRate / 12, i));
        }
    }

    public static double future_value(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1.0 + monthlyInterestRate, years * 12);
    }
}


