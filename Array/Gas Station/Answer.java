class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int diff = 0;
        for(int i = 0; i < gas.length; i++){
            diff = diff + (gas[i] - cost[i]);
        }

        if(diff < 0) return -1;

        int total = 0;
        int ans = 0;

        for(int i = 0; i < gas.length; i++){
            total += (gas[i] - cost[i]);

            if(total < 0){
                total = 0;
                ans = i + 1;
            }
        }

        return ans;
    }
}
