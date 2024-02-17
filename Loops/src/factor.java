import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value: " );
        int n = input.nextInt();

        System.out.println("The factors of " + n + " is:");
        for (int a =1; a <= n; a++){
            int b = n%a;
            if (b == 0){

                System.out.print(a + " ");
            }
        }
    }
}
