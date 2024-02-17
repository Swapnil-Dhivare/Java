import java.util.Scanner;

public class BSinDescending {
    // Array should be already sorted in descending array
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {100,99,87,76,65,52,44,42,32,10,-8,-9,-100};
        System.out.println("Enter the target");
        int target = in.nextInt();
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int[] arr , int target){
        int start =0;
        int end = arr.length-1;
        while (start <= end ){
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                end = mid-1;
            } else if (target < arr[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
