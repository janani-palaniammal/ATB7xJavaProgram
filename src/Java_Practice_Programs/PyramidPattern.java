package Java_Practice_Programs;

public class PyramidPattern {
    public static void main(String[] args) {
//    *
//   ***
//  *****
// *******
//*********
        int rows = 5;

        for (int i=1; i<=rows; i++ ) {
        // Print spaces before the stars on each line
            for (int j=1; j<=rows-i; j++) {
                System.out.print(" ");
            }
        // To Print stars
            for (int k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }
        // Move to the next line
            System.out.println();
        }

    }
}
