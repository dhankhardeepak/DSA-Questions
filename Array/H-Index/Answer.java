class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int range = citations[citations.length - 1];
        int n = citations.length - 1;
        int ans = -1;
        for(int i = 0; i <= range; i++){
            int ceilValIdx = getCeilValueIdx(i, citations);
            int getCitaionsforCielVal = n - ceilValIdx + 1;
            if(i <= getCitaionsforCielVal){
                ans = Math.max(ans, i);
            }
        }

        return ans;
    }

    public int getCeilValueIdx(int val, int[] citations){
        int lo = 0;
        int hi = citations.length - 1;

        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            if(citations[mid] < val){
                lo = mid + 1;
            }
            else{
                hi = mid;
            }
        }

        return lo;
    }
}