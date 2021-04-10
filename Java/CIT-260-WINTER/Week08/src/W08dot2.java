public class W08dot2 {
    public static void main(String[] args) {
        ///. Tells the user what the program does.
        //. Using the Date class (described in section 9.6.1 of the textbook)
        //. Create a Date object and set it's elapsed time to 10000, 100000,
        // 1000000, 10000000, 100000000, 1000000000, and 10000000000 and
        // displays the data and time using the toString( ) method, respectively.
        //. Display a goodbye message.


        // Create a Date object
        java.util.Date date = new java.util.Date();

        System.out.println("This program uses the Date class to display a set of dates and times.");
        for (long i = 10000; i <= 1e11; i *= 10) {

            date.setTime(i);

            System.out.println(date.toString());
        }

        System.out.println("Goodbye");
    }
}
