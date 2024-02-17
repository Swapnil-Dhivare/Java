package Loops.src;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        // Q: Print the nth term of the fibonachi series
        Scanner in = new  Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();

        System.out.println("nth term =  ");
        int n = in.nextInt();

           for (int count = 2; count <= n;count++ ){
               int temp = b;
               b = a + b;
               a = temp;

           }
        System.out.println(b);
    }
}
