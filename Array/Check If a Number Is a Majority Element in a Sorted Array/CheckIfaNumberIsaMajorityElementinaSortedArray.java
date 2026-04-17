class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        // Your code goes here
        //put numbers in hashmap and count the frequency of a given target
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        int targetFrequency = hm.get(target) != null ? hm.get(target) : -1;
        if(targetFrequency == -1) return false;
        return targetFrequency > (nums.length / 2);
    } 
}