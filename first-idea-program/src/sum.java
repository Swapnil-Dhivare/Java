import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        System.out.println("Input two number");
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
    }
}
