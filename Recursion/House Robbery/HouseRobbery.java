class Solution {
    public int houseRobber(int[] money) {
        int[] dp = new int[money.length];
        int[] dp2 = new int[money.length];

        Arrays.fill(dp, -1);
        Arrays.fill(dp2, -1);

        if(money.length == 1) return money[0];

        return Math.max(func(0, money.length - 2, money, dp), func(1, money.length - 1, money, dp2));
    }

    public int func(int idx, int range, int[] money, int[] dp){
        if(idx > range) return 0;
        if(dp[idx] != -1) return dp[idx];

        int pick = money[idx] + func(idx + 2, range, money, dp);
        int notPick = func(idx + 1, range, money, dp);

        return dp[idx] = Math.max(pick, notPick);

    }
}