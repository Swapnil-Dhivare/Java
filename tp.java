import java.util.Scanner;

public class tp {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operator");
        String c = input.next();
        System.out.println("Enter the numbers");
        a = input.nextInt();
        b = input.nextInt();


        switch (c)
        {
            case "+":
                System.out.println("Addition " + (a+b));
                break;
            default:
                System.out.println("nothing");
                break;
        }
    }
}
