package Ex_21072024;

public class Lab108 {
    public static void main(String[] args) {
        final boolean b1 = true; //b1 is false is fixed because of final keyword

//        for (int i=0;b1;i++) {
//            System.out.println("Hello"); // Hello prints infinite times, becoz b1 is always true.
//        }

//        for (int i=0;;) { // Hello Team prints infinite times, becoz of no condition.
//            System.out.println("Hello Team");
//        }

//        for (;;) { //thi is also infinite - No condition
//            System.out.println("Hello");
//        }

        for (float f=0;f<10.67;f++) {  //last value 10 is less than 10.67, So loop executes from 0-10
            System.out.println("Hi, Float -> "+f);
        }

    }
}
