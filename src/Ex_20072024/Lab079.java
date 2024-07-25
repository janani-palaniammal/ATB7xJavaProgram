package Ex_20072024;

public class Lab079 {
    public static void main(String[] args) {
        // Modulus - %
        // 10%2 -> 0
        // 11%2 -> 1
//        2 | 11 | 5 - Q
//            10
//           -----
//            1 - R
        int a = 11;
        if(a%2 == 0) {
            System.out.println("Even number -> "+ a);
        } else {
            System.out.printf("Odd number %d ", a);
        }

        System.out.printf("\n%d", a);

    }
}
