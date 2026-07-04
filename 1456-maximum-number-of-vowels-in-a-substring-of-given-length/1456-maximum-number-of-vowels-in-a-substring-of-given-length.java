class Solution {
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int n = s.length();
        int l =0;
        int count =0;
        for(int r =0;r<k;r++){
            char ch = s.charAt(r);
            if(isVowel(ch)) count++;
        }
        int max =count;
        for(int r = k;r<n;r++){
            char ch = s.charAt(r);
            if(isVowel(ch)) count++;
            if(isVowel(s.charAt(r-k))) count--;
            max = Math.max(max,count);
        }
        return max;
    }
}