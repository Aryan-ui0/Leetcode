class Solution {
    public int longestContinuousSubstring(String s) {
        int n = s.length();
        int count =0;
        int temp =1;
        if(s.length()==1) return 1;
        for(int i =1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1) + 1){
                temp++;
            }
            else temp =1;
            count = Math.max(count,temp);
        }
        return count;
    }
}