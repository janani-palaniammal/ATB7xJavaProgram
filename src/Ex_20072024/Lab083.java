package Ex_20072024;

import java.util.Scanner;

public class Lab083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age>=20){
            System.out.println("Allowed for trip");
        } else {
            System.out.println("Not allowed for trip");
        }
    }
}
