import java.util.Arrays;
import java.util.Scanner;

public class Arrayinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input using for loop

                int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(arr[4]);

        for (int num : arr) {   // for every element in array, print the element
            System.out.print(num + " ");   // Here num represents elements of the array
        }
        System.out.println();

        System.out.print(Arrays.toString(arr));   // another way of printing arrays
    }
}
