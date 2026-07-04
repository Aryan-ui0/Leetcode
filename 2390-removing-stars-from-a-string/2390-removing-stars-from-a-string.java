class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        int n =s.length();
        StringBuilder res = new StringBuilder();
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            st.push(ch);
            while(!st.isEmpty() && st.peek()=='*'){
                st.pop();
                st.pop();
            }

        }
        for(char ch : st){
            res.append(ch);
        }
        return res.toString();
    }
}