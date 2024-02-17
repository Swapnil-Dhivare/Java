package BSprograms;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {1, 3};
        int target = in.nextInt();
        System.out.println(searchInsert(nums, target));

    }

    static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(start == end){
            if(target<=arr[start]){
                return start;
            }else{
                return start +1;
            }
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[start]) {
                return start;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            if (target > arr[end]) {
                return (end + 1);
            }


        }
        return start;

    }
}
