class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return solve(0, nums, dp);
    }

    public int solve(int idx, int[] nums, int[] dp){
        if(idx == nums.length - 1) return 0;
        if(nums[idx] == 0) return 999;

        if(dp[idx] != -1) return dp[idx];
        int currentAns = Integer.MAX_VALUE;
        for(int i = 1; i <= nums[idx]; i++){
            if(idx + i < nums.length){
                currentAns = Math.min(currentAns, 1 + solve(idx + i, nums, dp));
            }
        }

        return dp[idx] = currentAns;
    }
}