import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2dArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {2,3,4,1,4},
                {34,55,11,3},
                {66,33,23}
        };
        int target = in.nextInt();
//        System.out.println(search(arr,target););
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
   static int[] search(int[][] arr, int target){
       for (int row = 0; row < arr.length; row++) {
           for (int col = 0; col < arr[row].length; col++) {
               if (arr[row][col]==target){
                  return new int[]{row,col};
               }
           }
       }
       return new int[]{-1,-1};
   }
    }

