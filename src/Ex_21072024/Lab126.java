package Ex_21072024;

import java.util.Scanner;

public class Lab126 {
    public static void main(String[] args) {
        //Factorial Program
        //n= 5 -> Fact = 5*4*3*2*1
        //n=1 -> Fact = 1*1
        //n=3 -> Fact = 3*2*1

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num to print Factorial value:");
        int n = sc.nextInt();

        int fact = 1;

        for (int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println(fact);
        //n=5
        //i=1 -> fact = 1*1 = 1
        //i=2 -> fact = 1*2 = 2
        //i=3 -> fact = 2*3 = 6
        //i=4 -> fact = 6*4 = 24
        //i=5 -> fact = 24*5 = 120

        //Using while loop
        int i=1;
        int fact_1 = 1;
        while(i<=n) {
            fact_1*=i;
            i++;
        }
        System.out.println(fact_1);

        sc.close();
    }
}
