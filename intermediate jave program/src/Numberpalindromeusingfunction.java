import java.util.Scanner;

public class Numberpalindromeusingfunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       palindrome(in.nextInt());


    }
    static void palindrome(int n){
        int b = n;

        String s = Integer.toString(n);  // Converting the integer n into String so that we can get it's lenght
        int i = s.length() -1;           // s.lenght() gives us lenght
        int t = 0;

        while (n>0){
            int a =n;
            a = n%10;
            int p = (int) (a*Math.pow(10,i));
            t += p;
            n = n/10;
            i--;
        }
        if (t==b){
            System.out.println("The given number is palindrome");

        }else{
            System.out.println("The given number is not palindrome");
        }
//        System.out.println(t);
    }

}
