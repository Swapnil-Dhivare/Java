import java.util.Scanner;

public class largestandsmallestusingmethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers");
       float a = in.nextFloat();
       float b = in.nextFloat();
       float c = in.nextFloat();
        System.out.print("The largest from these three numbers is: ");
       largest(a,b,c);
        System.out.print("The smallest from these three numbers is: ");
       smallest(a,b,c);

    }

    static void largest(float a, float b, float c){

        float lar = a;
        if (b>lar){
            lar =b;
        }
        if (c>lar){
            lar =c;
        }
        System.out.println(lar);

    }

    static void smallest(float a, float b, float c){

        float small = a;
        if (b<small){
            small = b;
        }
        if (c<small){
            small = c;
        }
        System.out.println(small);
    }
}
