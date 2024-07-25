package Ex_20072024;

import java.util.Scanner;

public class Lab098 {
    public static void main(String[] args) {
        // Write a program name, age, salary - print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.next();

        System.out.println("Enter your Age");
        int age = sc.nextInt();

        System.out.println("Enter your Salary");
        double sal = sc.nextDouble();

        System.out.println("\nYour details are..");
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("Your Salary is: "+sal);

        sc.close();

    }
}
