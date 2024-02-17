import java.util.Scanner;

public class rupeestousd {
    public static void main(String[] args) {
        System.out.println("Enter Your value in rupees:");
        Scanner input = new Scanner(System.in);
        double ru = input.nextDouble();
        double usd = ru * 0.012;
        System.out.println("The value in usd is: " + usd);

    }
}
