package sortingProblems;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        Merging(nums1, nums2, m, n);
//        System.out.println(Arrays.toString(nums1));
        boolean swapped = false;
        for (int i = 0; i < nums1.length - 1; i++) {

            for (int j = 1; j <= nums1.length - i - 1; j++) {
                if (nums1[j - 1] > nums1[j]) {
                    int temp = 0;
                    temp = nums1[j - 1];
                    nums1[j - 1] = nums1[j];
                    nums1[j] = temp;
                    swapped = true;
                }
            }
            // If the values didn't swapped for a particular value of 'i' that means that the array is sorted and hence we should break the program
            if (!swapped) {
                break;
            }

        }
        System.out.println(Arrays.toString(nums1));

    }

    static void Merging(int[] nums1, int[] nums2, int m, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }
    }
}



