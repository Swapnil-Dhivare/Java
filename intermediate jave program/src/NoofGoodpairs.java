public class NoofGoodpairs {
    // Q: https://leetcode.com/problems/number-of-good-pairs/
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int count =0;
        int n = nums.length;
        int ans = count(nums,count);
        System.out.println(ans);


    }

   static int count(int[] nums, int count) {
       int i = 0;
       int j = i + 1;
       while (i < j) {
           for (; i < nums.length; i++) {
                j = i + 1;
               for (; j < nums.length; j++) {
                   if (nums[i] == nums[j]) {
                       count++;
                   }
               }

           }

       }
       return count;
   }
}
