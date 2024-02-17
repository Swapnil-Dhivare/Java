package Loops.src;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = fact(6);
        System.out.println(ans);
//        System.out.println(fact(input.nextInt()));

    }
    static int fact(int n){
      if(n<=1){
          return n;
      }
      return n*fact(n-1);
    }
}
