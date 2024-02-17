import javax.swing.*;
import java.util.Scanner;

public class primeornot {
    /*
          Q: Define a method to find out if a number is prime or not.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        primeornot(in.nextInt());

    }

    static void primeornot(int a) {
        int temp = 1;
        int n = 2;
        while (n<a){
            temp = a%n;
            n ++;
            if (temp == 0){
                System.out.println("Prime");
               
            }
        }




    }
    }