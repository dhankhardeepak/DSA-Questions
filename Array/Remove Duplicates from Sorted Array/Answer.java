class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[k]){
                //can be swapped
                k = k + 1;
                nums[k] = nums[i];
            }
        }

        return  k+1;
    }
}