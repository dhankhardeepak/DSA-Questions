class Solution {
    public void rotate(int[] nums, int k) {
        if(k >= nums.length){
            k = k % nums.length;
        }
        //Step 1 -> Reverse the whole array
        int l = 0;
        int r = nums.length - 1;
        reverse(nums, l, r);
        

        //Step 2 -> Reverse the first K elements
        l = 0;
        r = k - 1;
        reverse(nums, l, r);


        //step-3 -> Reverse the Last N - k elements
        l = k;
        r = nums.length - 1;
        reverse(nums, l, r);
    }

    public void reverse(int[] nums, int l, int r){
        while(l < r){
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
    }
}