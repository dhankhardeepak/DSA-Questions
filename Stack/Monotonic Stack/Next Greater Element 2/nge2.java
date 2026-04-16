class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length * 2 - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i % arr.length]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i % arr.length] = -1;
            }
            else{
                ans[i % arr.length] = st.peek();
            }
            st.push(arr[i % arr.length]);
        }

        return ans;
    }
}
