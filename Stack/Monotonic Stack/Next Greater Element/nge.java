class Solution {
    public int[] nextLargerElement(int[] arr) {
     int[] ans = new int[arr.length];
     Stack<Integer> st = new Stack<>();

     st.push(0);

     for(int i = 1; i < arr.length; i++){
        while(!st.isEmpty() && arr[st.peek()] < arr[i]){
            ans[st.peek()] = arr[i];
            st.pop();
        }
        st.push(i);
     }

     for(int i = 0; i < arr.length; i++){
        if(ans[i] == 0){
            ans[i] = -1;
        }
     }

     return ans;
    }
}