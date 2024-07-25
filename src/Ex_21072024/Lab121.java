package Ex_21072024;

public class Lab121 {
    public static void main(String[] args) {
        for (int i=0; i<=50; i++) {
            if(i%2==0) {
                System.out.println("Even "+i);
                continue;   // Continue to loop
            }
            System.out.println("Odd "+i);
        }

        System.out.println("\n---------Break---------");
        for (int i=0; i<=50; i++) {
            if(i%2==0) {
                System.out.println("Even "+i);
                break;     //breaks the loop
            }
            System.out.println("Odd "+i);
        }
    }
}
