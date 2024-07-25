package Ex_20072024;

public class Lab095 {
    public static void main(String[] args) {
        // JDK > 13

        int itemCode = 001;

        //Instead of break statement, we can use arrow symbol ->
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }
    }
}
