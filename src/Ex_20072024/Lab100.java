package Ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab100 {
    public static void main(String[] args) {
        // Program to Check if a Number is Positive, Negative or Zero.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num>0){
            System.out.println("Positive number -> "+num);
        } else if (num<0){
            System.out.println("Negative number -> "+num);
        }else {
            System.out.println("Zero number -> "+num);
        }


    }
}
