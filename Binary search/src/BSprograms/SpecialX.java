package BSprograms;
// Q: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class SpecialX {
    public static void main(String[] args) {
        int[] nums = {};
        int ans = x(nums);
        System.out.println(ans);
    }
    static int x(int[] nums){
        for(int i = 0; i<= nums.length; i++){
            int count = 0;
            for(int j = 0; j< nums.length; j++){
                if(nums[j]>=i){
                    count++;
                }
                if(count>i){
                    break;
                }

                }
                 if(count==i){
                     return i;
            }
        }
        return -1;
    }
}
