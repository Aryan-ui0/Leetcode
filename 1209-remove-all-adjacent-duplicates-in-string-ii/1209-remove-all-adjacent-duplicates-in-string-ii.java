class Node{
    char ch;
    int count;
    Node(char ch,int count){
        this.ch = ch;
        this.count = count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<Node> st = new Stack<>();
        for(char ch : s.toCharArray()){

            if(!st.isEmpty() && st.peek().ch == ch){
                st.peek().count++;
                if(st.peek().count==k){
                    st.pop();
                }
            }
            else st.push(new Node(ch,1));
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            Node temp = st.pop();
            for(int i = 0;i<temp.count;i++){
                res.append(temp.ch);
            }

        }
        return res.reverse().toString();
    }
}