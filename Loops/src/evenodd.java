import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("Input the number:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = 2;
        if (a % c  == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

        }

    }





