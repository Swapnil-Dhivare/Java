import java.util.Scanner;

public class tempconvertion {
    public static void main(String[] args) {
        System.out.println("Print the temperature in Celcius:");
        Scanner input = new Scanner(System.in);
        Float C = input.nextFloat();
        Float F = C*9/5 + 32;
        System.out.println("The temp in farenheit is: "+ F);

    }
}
