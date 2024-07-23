package Ex_14072024;

public class Lab046 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 23;
     //   byte c = a+b; //whenever operator is used in byte, it might exceed the value >127, so we need to use bigger one than this i.e., int in this case
        int c = a+b;
        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B';
        int c1 = a1+b1; // AB ->this is not a char
     //   char d1 = 65; // this is also possible. Basically each character has Integer value
        System.out.println(c1); //(65+66) - ASCII value
        System.out.println('A' == 65);
        System.out.println('B' == 69);
    }
}
