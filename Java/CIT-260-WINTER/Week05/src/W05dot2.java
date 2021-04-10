public class W05dot2 {

    public static void main(String[] args) {
        /*Tells the user what the program does.
        Uses a loop to display a table of all of the numbers from 100 to 1000 that are divisible by both 5 and 6.
        The numbers must be separated by exactly one space and there must be 10 numbers per line.
         Displays a goodbye message.
                */
        final int NUMBERS_PER_LINE = 10;	// Display 10 numbers per line

        int counter = 0;	// Count the number of numbers divisible by 5 and 6

        // Test all numbers from 100 to 1,000
        for (int i = 100; i <= 1000; i++) {

            // Test if number is divisible by 5 and 6
            if (i % 5 == 0 && i % 6 == 0) {

                counter++;	// increment count

                // Test if numbers per line is 10
                if (counter % NUMBERS_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }

        System.out.println("Goodbye!");
    }


}