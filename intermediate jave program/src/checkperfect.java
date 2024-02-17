import java.util.Scanner;

public class checkperfect {
    // Q: Check if the number is perfect no. or not
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        check(in.nextInt());

    }

    static void check(int a) {
        int s = 0;

       for (int n= 1; n<a; n++){
            int c = 0;
            c = a%n;
            if (c == 0){

                s +=n;
            }

        }
        if (s == a){
            System.out.println("The number is perfect number");
        }else{
            System.out.println("The number is not perfect number");
        }
    }
}
