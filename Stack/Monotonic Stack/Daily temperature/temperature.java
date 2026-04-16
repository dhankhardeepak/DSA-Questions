class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        //EDGE CASE
        if(temperatures.length <= 1){
            return ans;
        }

        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(int i = 1; i < temperatures.length; i++){
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                int idx = st.peek();
                ans[idx] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }

        return ans;
    }
}