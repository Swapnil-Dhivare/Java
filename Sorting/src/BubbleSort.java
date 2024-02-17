import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,6};
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 1; j <= arr.length-i-1; j++) {
                if (arr[j-1]>arr[j]){
                    int temp =0;
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            // If the values didn't swapped for a particular value of 'i' that means that the array is sorted and hence we should break the program
            if (!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}