package Ex_20072024;

public class Lab097 {
    public static void main(String[] args) {
        //JDK > 13
        char code = 'B';
        int val = switch (code) {
            case 'A':
                yield 65;  // return  //yield is rarely used
            case 'B':
                yield 66;
            default:
                throw new IllegalStateException("Unexpected Value:"+code);
        };
        System.out.println(val);

    }
}
