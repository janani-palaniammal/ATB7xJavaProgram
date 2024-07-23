package Ex_14072024;

public class Lab057 {
    public static void main(String[] args) {
        int b=10;
        int c= b++;
        int d= ++b;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //  Part ->  A -> ++a , Exp1 = 11 , a = 11
        //  Part ->  B -> a++ , Exp2 = 11 , a = 12
        //  Part ->  C -> a++, Exp3 = 12 , a = 13
        // op ->  exp1+ exp2+exp3
        // a  = 13

    }
}
