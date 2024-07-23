package Ex_13072024;

public class Lab018 {
    public static void main(String[] args) {
        //Concatenation
        int a = 10;
        int b= 34;
        System.out.println(a+b);

        String s1 = "Job";
        String s2 = "Ready";
        System.out.println(s1+s2);

        String s3 = "Amit";
        int x = 99;
        int y = 100;
        System.out.println(x+y);
        System.out.println(x+s3);
        System.out.println(s3+x);
        System.out.println(s3+y);
        System.out.println(x+y+s3);  //BODMAS. As integer value first so it get added and append string
        System.out.println(s3+x+y);  //Here String comes first, so after this integer would get added, as it considered as string
        System.out.println(x+s3+y);
        System.out.println(x+y+s3+y+s3+x+y);

    }
}
