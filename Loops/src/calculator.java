import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your operator: ");
        char op = in.next().trim().charAt(0);
        int ans =0;
        while (true){
            System.out.println("Enter two numbers:");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            switch (op) {
                case '+' -> {
                    ans = num1 + num2;
                    System.out.println(ans);
                }
                case '*' -> {
                    ans = num1 * num2;
                    System.out.println(ans);
                }
                case '/' -> {
                    ans = num1 / num2;
                    System.out.println(ans);
                }
                case '-' -> {
                    ans = num1 - num2;
                    System.out.println(ans);
                }
                case '%' -> {
                    ans = num1 % num2;
                    System.out.println(ans);
                }
                default -> System.out.println("Enter invalid operator");
            }
        }

    }
}
