import java.util.Scanner;

public class Pythagoreantripletornot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        pyth(in.nextInt(),in.nextInt(),in.nextInt());

    }

    static void pyth(int a, int b, int c){
        if (a * a + b * b == c * c || b*b + c*c == a*a || a*a + c*c == b*b){
            System.out.println("The numbers given are Pythagorean triplets");
        }
        else{
            System.out.println("The numbers given are not Pythagorean triplets");
        }
    }
}
