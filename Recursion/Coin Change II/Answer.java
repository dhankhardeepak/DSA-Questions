class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return coinChange(0, coins, amount, dp);
    }

    public int coinChange(int idx, int[] coins, int amount, int[][] dp){
        if(amount == 0){
            return 1;
        };
        if(amount < 0 || idx >= coins.length) return 0;  

        if(dp[idx][amount] != -1) return dp[idx][amount];   

        if(amount < coins[idx]){
            return dp[idx][amount] = coinChange(idx + 1, coins, amount, dp);
        }

        int pick = coinChange(idx, coins, amount - coins[idx], dp);
        int not_pick = coinChange(idx + 1, coins, amount, dp);

        return dp[idx][amount] = pick + not_pick;
    }
}