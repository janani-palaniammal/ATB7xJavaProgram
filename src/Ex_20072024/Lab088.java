package Ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        // Switch - Better way to 2+ condition
        // Which day it is - Day from 1 to 7
        // 3 -> Wed

        // MTWTFSS

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7:");
        int day = sc.nextInt();

        // switch condition is given without break statement. In this case, based on day number entered, the actual day and the following day will also get printed in output
        switch (day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("No idea, which day it is..");
        }

        sc.close();
    }
}
