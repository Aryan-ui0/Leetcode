class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for(char ch : s.toCharArray()){
            freq[ch - 'a']--;
            if(visited[ch-'a']) continue;
            while(!st.isEmpty() && st.peek()>ch && freq[st.peek()-'a']>0){
                char temp = st.pop();
                visited[temp - 'a'] = false;
            }
            st.push(ch);
            visited[ch-'a'] = true;
        }
        StringBuilder res = new StringBuilder();
        for(char ch : st){
            res.append(ch);
        }
        return res.toString();
    }
}