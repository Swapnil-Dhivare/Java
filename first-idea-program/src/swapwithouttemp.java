import java.util.Scanner;

public class swapwithouttemp {
    public static void main(String[] args) {

        int a,b;
        System.out.print("Enter two numbers\n");
        Scanner input = new Scanner(System.in);
         a = input.nextInt();
         b = input.nextInt();

         // Swapping with using two variables only
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("The numbers after swap are: a = " + a + " and" + " b = " + b);
    }
}
