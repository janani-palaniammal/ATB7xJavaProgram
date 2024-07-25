package Ex_21072024;

public class Lab133 {
    public static void main(String[] args) {
        // Functions
        // Block of code which we can reuse.
        // 1. Pre-built - Math.max()
        // 2. User created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function

        //  1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        function_type1();

        System.out.println("------------------------------");

        String name = function_type2();
        System.out.println(name);

        System.out.println("------------------------------");

        function_type3("Automation");
        function_type3("123");

        System.out.println("------------------------------");

        int result = function_type4(3,4);
        System.out.println("Sum -> "+ result);

    }

    //  1.Without Parameters and Without Return Type
    static void function_type1(){
        System.out.println("1.Without Parameters and Without Return Type");
    }

    // 2.Without Parameters but With Return Type
    static String function_type2(){
        System.out.println("2.Without Parameters but With Return Type");
        return "Janani";
    }

    //  3.With Parameters and Without Return Type
    static void function_type3(String st){
        System.out.println("3.With Parameters and Without Return Type");
        System.out.println("Value -> "+ st);
    }

    //  4. With Parameters and With Return Type
    static int function_type4(int a, int b) {
        System.out.println("4. With Parameters and With Return Type");
        return a+b;
    }
}
