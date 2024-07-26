package Java_Practice_Programs;

import java.util.Scanner;

public class LeapYear2024 {
    public static void main(String[] args) {
        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check whether it is a leap year or not:");
        int year = sc.nextInt();

        if ( (year%4 == 0 && year%100 != 0) || year%400 == 0 ) {
            System.out.println("Leap year -> "+year);
        } else {
            System.out.println("Not a leap year -> "+year);
        }

        sc.close();
    }
}