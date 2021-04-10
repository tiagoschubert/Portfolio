import java.util.Scanner;

public class W04dot1 {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.print("This program converts a hexadecimal digit into a four digit binary number. \n"
                +
                "Enter a hexadecimal number:");

        String hexadecimal = scanner.next();
        String pattern1 = "^[0-9A-Fa-f]+$";
        int bin_num[] = new int[100];
        int j, i =1;
        if (hexadecimal.matches(pattern1)) {
            int decimal = Integer.parseInt(hexadecimal, 16);

            while(decimal != 0)
            {
                bin_num[i++] = decimal%2;
                decimal = decimal/2;
            }

            System.out.print("The binary value is " );
            for(j=i-1; j>0; j--)
            {
                System.out.print(bin_num[j]);
            }


            // System.out.print("The binary value is " + binary);
        }else {
            System.out.print(hexadecimal + " is not a valid hexadecimal digit.");

        }

        System.out.print("\nGoodbye!");


    }
}
