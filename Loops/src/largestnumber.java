import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2 = input.nextInt();

        if (num1 > num2 ){
            System.out.println(num1 + " is greater than " + num2 );
        }
        else{
            System.out.println(num2 + " is greater than " + num1);
        }

    }
}
