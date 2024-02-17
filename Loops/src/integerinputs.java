package Loops.src;

import java.util.Scanner;

public class integerinputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;

        while (true) {
            int i = input.nextInt();


            if (i == 0){
            break;
            }
            a = a + i;
        }
        System.out.println(a);

    }
}