package BSprograms;

public class Floorofanarray {
    // greatest number that is <= target
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int ans = bs(arr,target);
        System.out.println(ans);
    }

    static int bs(int[] arr,int target){
        int start =0;
        int end = arr.length -1;
        boolean ifAsc = arr[start] < arr[end];
        // what if the target element is smallest than the smallest elemtent in the array
        if (target<arr[0]){
            return -1;
        }
        while (start <= end){



            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return arr[mid];
            }
            if (ifAsc){
                if (target < arr[mid]){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return arr[end];
    }
}
