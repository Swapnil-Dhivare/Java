import java.util.Scanner;

public class Factorialusingfunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        factorial(in.nextInt());

    }

    static void factorial(int n){
        int s =1;
        while (n>0){
            s*=n;
            n--;
        }
        System.out.println(s);


    }
}
