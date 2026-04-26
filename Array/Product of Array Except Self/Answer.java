class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pfProd = new int[nums.length];
        pfProd[0] = nums[0];
        int[] sufProd = new int[nums.length];
        sufProd[nums.length - 1] = nums[nums.length - 1];

        for(int i = 1; i < nums.length; i++){
            pfProd[i] = pfProd[i - 1] * nums[i]; 
        }

        for(int i = nums.length - 2; i >= 0; i--){
            sufProd[i] = sufProd[i + 1] * nums[i];
        }

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                ans[i] = sufProd[i + 1];
            }
            else if(i == nums.length - 1){
                ans[i] = pfProd[i - 1];
            }
            else{
                int Tempans = pfProd[i - 1] * sufProd[i + 1];
                ans[i] = Tempans;
            }
        }

        return ans;

    }
}