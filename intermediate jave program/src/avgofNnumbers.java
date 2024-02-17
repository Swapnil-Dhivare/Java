import java.util.Scanner;

public class avgofNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        int temp = 0;
        System.out.print("Enter the numbers: ");
        for (int a = 1; a <= n; a++){

            int b = in.nextInt();
            temp += b;
        }
        int ans = temp/n;
        System.out.print("The average of these numbers is: ");
        System.out.print(ans);
//        System.out.println(temp);

    }
}