import java.util.Scanner;

public class sumfunction {
    public static void main(String[] args) {
      sum();               //function call


    }
                        /*
                       access modifier (will look into OOP) return_name(arguments){
                                 //  body
                                return statement;
                       */




    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);              //for displaying value
    }

}
