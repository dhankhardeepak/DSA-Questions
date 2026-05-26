class Solution {
    public int candy(int[] ratings) {
        int[] count = new int[ratings.length];
        Arrays.fill(count, 1);

        for(int i = 1; i < count.length; i++){
            if(ratings[i]  > ratings[i-1]){
                count[i] = Math.max(count[i], count[i-1] + 1);
            }
        }

        for(int i = count.length - 2; i >= 0; i--){
            if(ratings[i] > ratings[i+1]){
                count[i] = Math.max(count[i], count[i+1] + 1);
            }
        }

        //return the ans
        int ans = 0;
        for(int i = 0; i < count.length; i++){
            ans += count[i];
        }

        return ans;
    }
}