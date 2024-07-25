package Ex_20072024;

public class Lab086 {
    public static void main(String[] args) {
        System.out.println("-------- First set --------");
        if (false) {   // No output as the first if condition is false, so the inner loops won't execute
            System.out.println("1");
            if (true) {
                System.out.println("2");
                if (true) {
                    System.out.println("3");
                }
            }
        }

        System.out.println("-------- Second set --------");
        if (true) {
            System.out.println("1");
            if (false) {  //Only first loop will execute, second inner loop is false so no further execution
                System.out.println("2");
                if (true) {
                    System.out.println("3");
                }
            }
        }
    }
}
