package Ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
// Java treats integers leading with 0 as octal numbers.
// Eg: int a = 008,  here the leading zero indicates that it is an octal representation of the number 8.
// However, the value 008 is treated as an invalid octal number because valid octal digits range from 0 to 7.
        //Octal Representation: Symbols: 0,1,2,3,4,5,6,7 (total 8) Hence Base- 8
        // 4 2 1
        // 0 0 0 -> 0
        // 0 0 1 -> 1
        // 0 1 0 -> 2
        // 0 1 1 -> 3
        // 1 0 0 -> 4
        // 1 0 1 -> 5
        // 1 1 0 -> 6
        // 1 1 1 -> 7

        // int a = 010 -> this gives the output as 8.
        // 0*8*8 + 1*8 + 0 = 8 => 0(8power2)+1(8power1)+0(8power0)


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item code");
        int itemcode = sc.nextInt();
        switch (itemcode) {
            case 001,002,003,004,005,016,017,020:
                System.out.println("It is Electronic gadget");
                break;
            case 006,007,010,011,012,013,014,015:
                System.out.println("It is Mechanical gadget");
                break;
            default:
                System.out.println("None");
        }

    }
}
