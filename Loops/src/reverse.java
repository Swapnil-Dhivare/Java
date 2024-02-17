package Loops.src;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int a = 10;
        int ans = 0;
        while (n > 0) {

            int s = n % a;

            ans = ans * 10 + s;
            n = n/a;
        }
        System.out.println(ans);
    }
}
