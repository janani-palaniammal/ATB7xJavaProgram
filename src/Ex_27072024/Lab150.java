package Ex_27072024;

public class Lab150 {
    public static void main(String[] args) {
        // String - Bunch of Chars.
        //
        String s1 = new String("Janani"); // Heap Area
        String s2 = "janani"; // String constant pool

        // String - Immutable in nature.
        System.out.println(s1.length());
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
    }
}
