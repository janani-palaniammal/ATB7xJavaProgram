package Ex_27072024;

public class Lab143 {
    public static void main(String[] args) {
        // Arugment values are provided in Configuration settings
        if(args.length>0) {
            for (int i=0; i<args.length; i++) {
                System.out.println(args[i]);
            }
        }else {
            System.out.println("No arguments given");
        }
    }
}
