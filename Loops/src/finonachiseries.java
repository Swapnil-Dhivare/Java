import java.util.Scanner;

public class finonachiseries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth term");

        int n = in.nextInt();
        int a = 0;
        int b = 0;


        for (int i =1; i <=n; i++   ){
         int temp = 1;
         b = a +b ;
         a = temp;
            System.out.print(b + " ");
        }

    }
}
