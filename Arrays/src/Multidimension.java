import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        How to print a matrix.. something like this

             1 2 3
             4 5 6
             7 8 9

             for this we use 2D arrays
         */

      //   int[][] arr = new int[3][];   //  the first bracket is for row and it is mandatory to write something in it while the second is for column and we can leave it blank

//       arr = new int[][]{
//                {1,2,3}, // 0th index
//                {4,5,6}, // 1st ndex
//                {7,8,9,10} // 2nd index -> arr2D[2] = {7,8,9,10}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length );   // no of rows

      // INPUT

        for (int row = 0; row < arr.length ; row++){
          // for each col in every row
            for (int col = 0; col < arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }

        }

      // OUTPUT

//        for (int row = 0; row < arr.length ; row++){
//            // for each col in every row
//            for (int col = 0; col < arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//
//        }

         // another way for output

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // another way for output i.e Advanced for loop

        for (int[] a : arr){
            System.out.println(Arrays.toString(arr));
        }

    }
}
