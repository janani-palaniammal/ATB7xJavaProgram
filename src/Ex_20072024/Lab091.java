package Ex_20072024;

import java.util.Scanner;

public class Lab091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        char user_input = sc.next().charAt(0);

        switch(user_input){
            case 'a':
                System.out.println("Vowel - a");
                break;
            case 'e':
                System.out.println("Vowel - e");
                break;
            case 'i':
                System.out.println("Vowel - i");
                break;
            case 'o':
                System.out.println("Vowel - o");
                break;
            case 'u':
                System.out.println("Vowel - u");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
        System.out.println("------End of first Switch-------- \n");

        //Alternate way of switch
        System.out.println("Enter the value:");
        char input2 = sc.next().charAt(1);

        switch (input2){
            case 'a','e','i','o','u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("It's a Consonant");
        }
        System.out.println("------End of second Switch--------");

        sc.close();
    }
}
