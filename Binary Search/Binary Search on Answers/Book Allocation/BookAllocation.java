class Solution {
    public int findPages(int[] nums, int m) {
        //Binary Search
        //First find the range 
        if(m > nums.length) return -1;
        if(m == nums.length) return maxOfArray(nums);
        int lo = maxOfArray(nums);
        int hi = sumOfAray(nums);

        int ans = lo;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            int stu = getStudentsNumforTheMid(nums, mid);
            if(stu > m){
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }

        return lo;
    }

    public int maxOfArray(int[] nums){
        int max = -1;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public int sumOfAray(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    public int getStudentsNumforTheMid(int[] nums, int mid){
        int stu = 1;
        int currAns = 0;
        for(int i = 0; i < nums.length; i++){
            if(currAns + nums[i] <= mid){
                currAns += nums[i];
            }
            else{
                stu++;
                currAns = nums[i];
            }
        }
        return stu;
    }
}