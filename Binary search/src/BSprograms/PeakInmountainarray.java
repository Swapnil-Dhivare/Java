package BSprograms;
// Q:https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class PeakInmountainarray {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};

        int ans = formid(arr);
        System.out.println(ans);
    }
    static int formid(int[] arr){

            int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

}

