class Solution {
    public boolean isMatch(String s, String p) {
        return solve(0, 0, s, p);
    }

    public boolean solve(int i, int j, String s, String p){
        if(j == p.length()) return i == s.length();

        boolean firstCharacterMatched = false;
        if(i < s.length() && (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i))){
            firstCharacterMatched = true;
        }

        if(j+1 < p.length() && p.charAt(j+1) == '*'){
            boolean notTake = solve(i, j + 2, s, p);
            boolean take = firstCharacterMatched && solve(i + 1, j, s, p);
            return take || notTake;
        }else{
            return firstCharacterMatched && solve(i+1, j+1, s, p);
        }
    }
}