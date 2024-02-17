public class RemoveDuplicates {
    // Q: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int ans = ans(nums);
        System.out.println(ans);

    }
    static int ans(int[] nums){
        int element = nums[0];
        int k =0;
        for (int i = 0; i < nums.length; i++) {
            if (element==nums[i]){
                k++;

            }
            element = nums[i];
        }

        return k-1;
    }

//    public static int k(int[] nums){
//        int k = 1;
//        for(int i =1;i<nums.length;i++){
//
//            if(nums[i]==nums[i-1]){
//                k++;
//            }
//
//        }
//        return k;
//    }
}
