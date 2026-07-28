class Solution {
    public boolean pal(String s,int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        int left = 0;
        int right = n-1;
        int count = 0;
        boolean res = true;
        while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else if(s.charAt(left)!=s.charAt(right)){
                if(pal(s,left+1,right) || pal(s,left,right-1)) return true;
                else return false;

            }

            
            
        }
        return res;
    }
}