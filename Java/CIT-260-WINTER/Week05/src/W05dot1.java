import java.text.DecimalFormat;

public class W05dot1 {

    public static void main(String[] args) {
        /*
	Tells the user what the program does.
    Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds) and display the following table.
    Outputs a goodbye message.
	 */
        //what the program does
        System.out.print("Converting kilogram to Pounds");

        //formtating
        DecimalFormat f = new DecimalFormat("##.0");

        System.out.println("\nKilograms   Ponds");
        System.out.println("--------   -----");

        //Calculating Pounds
        for(int i = 1; i <= 15; i += 2){
            double pond = i * 2.2;
            if (i<10) {
                System.out.println(i + "          " + f.format(pond));
            }else {
                System.out.println(i + "         " + f.format(pond));
            }
        }

        System.out.println("Goodbye!");
    }


}


