class Solution {
    public int largestSubarraySumMinimized(int[] a, int k) {
     if(k > a.length) return -1;
     if(k == a.length) return maxofArray(a);

     int lo = maxofArray(a);
     int hi = sumOfArray(a);

     while(lo <= hi){
        int mid = lo + (hi - lo) /2;
        int getSplit = getNoOfSplitPossible(a, mid);
        if(getSplit <= k) hi = mid - 1;
        else{
            lo = mid + 1;
        }
     }

     return lo;
    }

    public int maxofArray(int[] arr){
        int max = -1;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public int sumOfArray(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public int getNoOfSplitPossible(int[] arr, int mid){
        int split = 1;
        int currentSum = 0;

        for(int i = 0; i < arr.length; i++){
            if(currentSum + arr[i] <= mid){
                currentSum += arr[i];
            }
            else{
                split++;
                currentSum = arr[i];
            }
        }

        return split;
    }
}
