public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
     int[] nums = {1,1};
     int target =0;
     int ans = ans(nums,target);
        System.out.println(ans);
     }
    public static int ans(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int pivot = pivot(nums);
        if(target == nums[pivot]){
//            return true;
            return 1;
        }
        if(target<nums[pivot]){
            int ans =  search(nums,pivot+1,end,target);
            if(ans==-1){
                end = pivot-1;
                ans = search(nums,start,end,target);

            }
            if (ans==1){
//                return true;
                return 1;
            }
        }



//        return false;
        return -1;
    }
    static int pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
                return mid;
            }
            if(nums[mid]>=nums[mid-1]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return start;
    }
    static int search(int[] nums,int start,int end,int target){
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[start]==target || nums[end]==target || nums[mid]==target){
                return 1;
            }
            if(target>nums[mid]){
                start = mid + 1;
            }
            if(target<nums[mid]){
                end = mid -1;
            }
        }
        return -1;
    }
}
