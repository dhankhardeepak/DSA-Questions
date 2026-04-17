class Solution {
    public int longestConsecutive(int[] nums) {
        //put everything in the set
        if(nums.length == 0 || nums.length == 1) return nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }

        int ans = 1;
        for(int item : hs){
            if(hs.contains(item - 1) == false){
                //this means this item can be starting point
                int i = item;
                int cnt = 1;
                while(hs.contains(i + 1)){
                    cnt++;
                    i = i + 1;
                }

                ans = Math.max(ans, cnt);
            }
        }

        return ans;
    }
}