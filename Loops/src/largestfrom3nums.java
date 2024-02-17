import java.util.Scanner;

public class largestfrom3nums {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        if ( a > b ){
//            if ( a > c){
//                System.out.println("The largest number is: " + a);
//
//            }else {
//                System.out.println("The largest number is: " + c );
//            }
//        } else if (b > c ) {
//            System.out.println("The largest number is: " + b);
//
//        }
//        else{
//            System.out.println("The largest number is :" + c );
//        }

        // or we can solve this problem with much simple approach
        int max = a;
        if (b>max){
                max = b;
        }if (c > max){
             max= c;
        }
        System.out.println(max);

    }
    }

