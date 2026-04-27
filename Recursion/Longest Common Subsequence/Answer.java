class Solution {
    public int lcs( String str1, String str2) {

        int[][] dp = new int[str1.length()][str2.length()];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return getLcs(0,0,str1,str2, dp);
    }

    public int getLcs(int idx1, int idx2, String str1, String str2, int[][] dp){
        if(idx1 == str1.length() || idx2 == str2.length()) return 0;

        if(dp[idx1][idx2] != -1) return dp[idx1][idx2];
        if(str1.charAt(idx1) == str2.charAt(idx2)){
            return dp[idx1][idx2] = 1 + getLcs(idx1 + 1, idx2 + 1, str1, str2, dp);
        }
        else{
            return dp[idx1][idx2] = Math.max(getLcs(idx1 + 1, idx2, str1, str2, dp), getLcs(idx1, idx2 + 1, str1, str2, dp));
        }
    }
}

