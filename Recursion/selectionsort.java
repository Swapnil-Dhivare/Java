package Recursion;

public class selectionsort {
    public static void main(String[] args) {
       int[] arr = {4,3,2,8,1};
    }
    static void selection(int[] arr,int r, int c){
        if (r==0){
            return;
        }
        if (c<r){

        }
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
