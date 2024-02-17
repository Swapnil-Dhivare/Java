package BSprograms;
// Q:  https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers
public class elementinInfinitearray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int target = 5;
        int start = 0;
        int chunk = 6;
        int end = start + chunk;

        int ans = check(arr,target,end,start,chunk);
        System.out.println(ans);




    }
    static int check(int[] arr, int target, int end, int start, int chunk){
        for (int i = 0; i <= end; i++) {
            if (arr[end] > target){
                int ans = Bs( arr,target,end,start,chunk);
               return ans;

            }else{
                start = end;
                end = end + chunk;
            }

        }

        return target;
    }
    static int Bs(int[] arr, int target, int end, int start, int chunk){
        while (start <= end){
            // find the middle element
//            int mid = (start + end)/2;
            // might be possible that start + end exceeds the range of int in java
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
