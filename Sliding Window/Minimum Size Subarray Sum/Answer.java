class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int currentSum = 0;
        int ans = nums.length + 1;

        for(int j = 0; j < nums.length; j++){
            currentSum += nums[j];

            while(currentSum >= target){
                ans = Math.min(j - i + 1, ans);
                currentSum -= nums[i];
                i++;
            }
        }
        

        if(ans == nums.length + 1) return 0;
        return ans;
    }
}