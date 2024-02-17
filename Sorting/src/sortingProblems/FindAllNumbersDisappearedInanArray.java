package sortingProblems;
// Q: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.Arrays;

public class FindAllNumbersDisappearedInanArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);

            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            int correct = arr[j] -1;
            if (j != correct){
                System.out.println(j+1);
            }
        }
    }

        static void swap ( int[] arr, int first, int last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
}
