package BSprograms;
// Q: https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class RotationCount {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int start = 0;
        int end = arr.length-1;
        int ans =  count(arr,start,end);
        System.out.println(ans);

    }
    static int count(int[] arr,int start , int end){
        if (arr[end]>arr[start]){
            return 0;
        }
        int pivot = pivot(arr);
        return pivot+1;
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        if (start==end){
            return -1;
        }
        while (start<end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
                return mid;
            }

            if (arr[start]>arr[mid]){
                end = mid -1;
            } else if (arr[start]<arr[mid]) {
                start = mid + 1;
            }
           if (arr[start] == arr[mid]){
               if (arr[mid]<arr[mid+1]){
                   start = mid + 1;
               }else{
                   return start;
               }
           }

        }
        return start;
    }
}
