package BSprograms;

public class Ceilingofanarray {
    // Ceiling: Smallest element in array greater or = targer
    // in this case ans = 16
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 24;
        int ans = bs(arr, target);
        System.out.println(ans);
    }

    static int bs(int[] arr, int target) {
        int start =0;
        int end = arr.length -1;
        boolean ifAsc = arr[start] < arr[end];
        // What if the target element is greatest than the greatest elemtent in the array
        if (target > arr[arr.length-1]){
            return -1;
        }
        while (start <= end){



            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
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
        return arr[start];


    }
}





