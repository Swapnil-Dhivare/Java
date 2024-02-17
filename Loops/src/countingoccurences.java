import java.util.Scanner;

public class countingoccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number");
        int n = input.nextInt();
        System.out.println("Input s: ");
        int s = input.nextInt();

        int a = 10;
        int count = 0;
        while (n > 0){

            int rem = n%a;
            n = n/a;
            if (rem == s){
                count++;


            }


        }
        System.out.println(count);


    }
}
