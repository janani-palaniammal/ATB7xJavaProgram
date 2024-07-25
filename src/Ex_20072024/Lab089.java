package Ex_20072024;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7:");
        int day = sc.nextInt();

        // With break statement
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea, which day it is..");
                break;
        }
        System.out.println("------Outside the Loop-------");
        sc.close();
    }
}
