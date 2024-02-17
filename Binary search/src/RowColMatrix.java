import java.util.Arrays;
import java.util.Scanner;

public class RowColMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };
        System.out.println("Enter the target");
        int target = in.nextInt();
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        int lb = 0;
        int ub = arr.length-1;
        while(lb<arr.length && ub >= 0){
            if (arr[lb][ub]==target){
                return new int[]{lb,ub};
            }
            if (arr[lb][ub]<target){
                lb++;
            }
            else{
                ub--;
            }
        }
        return new int[]{-1,-1};
    }
}
