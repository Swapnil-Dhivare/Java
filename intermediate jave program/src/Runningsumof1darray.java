import java.util.Arrays;

import static java.lang.Integer.sum;

public class Runningsumof1darray {
    public static void main(String[] args) {
//        Q: Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//        Return the running sum of nums.
        int[] nums = {1,2,3,4};
        for (int i = 1  ; i < nums.length; i++) {
            nums[i] += nums[i-1];

        }
        System.out.println(Arrays.toString(nums));
    }

        }



