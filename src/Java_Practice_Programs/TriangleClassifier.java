package Java_Practice_Programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of triangle side 1");
        int side1 = sc.nextInt();

        System.out.println("Enter the value of triangle side 2");
        int side2 = sc.nextInt();

        System.out.println("Enter the value of triangle side 3");
        int side3 = sc.nextInt();

        if (side1 == side2 && side1 == side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

    }
}
