package sortingProblems;
// Q: https://leetcode.com/problems/find-the-duplicate-number/description/
public class findduplicatenumbers {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        // first use cyclic sort to sort the array
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        // Now check for duplicate values and return them
        for(int j = 0;j < nums.length; j++){
            int correct = nums[j] - 1;
            if (nums[j]!= j+1){
                System.out.println(nums[j]);
            }
        }

    }
    static void swap(int[] nums,int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
    }




