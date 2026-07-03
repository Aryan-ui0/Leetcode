class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int n =temp.length;
        int[] res = new int[n];
        int idx =0;
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && temp[st.peek()]<temp[i]){
                res[st.peek()] = i-st.pop();
            }
            st.push(i);
        }
        return res;
    }
}