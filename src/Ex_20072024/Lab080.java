package Ex_20072024;

import java.util.Scanner;

public class Lab080 {
    public static void main(String[] args) {
        //Take user input and check if number id even or odd

        //Logic Building
        //1. Figure out the input //2. Data Types
        // What type of data type do you support - eg: int
        //How to take inout in Java? -Using Scanner class
          //nextInt()

        //3. Do we need conversion or directly
        //4. Rough Logic - num%2==0 - even or odd
        //5. Optimize

        Scanner sc = new Scanner(System.in); // object of the scanner Class - OOPs
        System.out.println("Enter the num:");
        int user_input = sc.nextInt();
        System.out.println(user_input);

        if(user_input%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
