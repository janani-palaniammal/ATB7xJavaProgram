package Ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();

        if (num1%num2 ==0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (num1%3 == 0){
            System.out.println("Zero remainder");
        } else {
            System.out.println("Remainder");
        }

    }
}
