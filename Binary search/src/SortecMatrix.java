import java.util.Arrays;
import java.util.Scanner;

public class SortecMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,17},
    };
        System.out.println("Enter your target");
    int target = in.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        int lb = 0;
        int ub = arr.length-1;

       if (arr[ub][ub]<target || arr[lb][lb]>target){
           return new int[]{-1,-1};
       }
        while (arr[lb][ub]<target){
            lb++;
        }

        while(lb<arr.length && ub >= 0){
            if (arr[lb][ub]==target){
                return new int[]{lb,ub};
            }
            if (arr[lb][ub]<target){
                lb++;
            }
            else{
            }
        }
        return new int[]{-1,-1};
    }
}
