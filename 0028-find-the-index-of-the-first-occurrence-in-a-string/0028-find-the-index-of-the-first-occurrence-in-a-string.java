class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(n==0 || m==0) return 0;
        if(haystack.equals(needle)) return 0;
        for(int i = 0;i<=n-m;i++){
            if(needle.equals(haystack.substring(i,i+m))) return i;
        }
        return -1;
    }
}