class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int num : asteroids){
            boolean alive = true;
            while(!st.isEmpty() && st.peek()>0 && num<0){
                if(st.peek()<-num){
                    st.pop();
                    
                }
                else if(st.peek()== -num){
                    st.pop();
                    alive = false;
                    break;
                }
                else {
                    alive = false;
                    break;
                }
            }
            if(alive) st.push(num);
        }
        int[] res = new int[st.size()];
        for(int i = 0; i < st.size(); i++){
            res[i] = st.get(i);
        }
        return res;
    }
}