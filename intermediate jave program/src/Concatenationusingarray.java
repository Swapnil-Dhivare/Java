//import java.util.Scanner;

import java.util.Arrays;

public class Concatenationusingarray {
    public static void main(String[] args) {
        // Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
        //Scanner in = new Scanner(System.in);
        int[] nums = {1,2,3};
        int n  = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
             ans[i] = nums[i];
             ans[i + n] = nums[i];
        }

//        for (int out : ans){
//
//            System.out.print(out );
//        }
        System.out.println(Arrays.toString(ans));
        
    }
}
