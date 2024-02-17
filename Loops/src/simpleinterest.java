import java.util.Scanner;



public class simpleinterest {
    //simple interest = P(1 + rt)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter initial principal balance");
        int P = input.nextInt();
        System.out.println("Enter annual interest rate");
        int r = input.nextInt();
        System.out.println("Enter time(in years)");
        int t = input.nextInt();

        int s = P*( 1+ r*t );
        System.out.println("The simple interest is: " + s);


    }



}
