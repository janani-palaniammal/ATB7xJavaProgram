package Ex_27072024;

import java.util.Scanner;

public class Lab136 {
    public static void main(String[] args) {
        // Arrays -> new
        int[] marks = new int[3];
        // index - 0,1,2
        // len - 3
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first mark:");
        marks[0] = sc.nextInt();
        marks[1] = 92;
        marks[2] = 93;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//        System.out.println(marks[10]); // AIOBE ArrayIndexOutOfBoundException

        boolean[] is_married  = {true, false};

        for (int i=0; i<marks.length; i++) {
            System.out.println("Marks from for loop:" + marks[i]);
        }

        String weedDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        for (int i=0; i < weedDays.length; i++) {
            System.out.println(weedDays[i]);
        }
    }
}
