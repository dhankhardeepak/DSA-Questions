class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int element = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }
            else if(element != nums[i]){
                count--;
            }
            else{
                count++;
            }
        }

        return element;
    }
}