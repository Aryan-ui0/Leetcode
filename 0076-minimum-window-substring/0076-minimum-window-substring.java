class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] arr1 = new int[128];
        int[] arr2 = new int[128];
        int l = 0;
        int count = 0;
        int len = Integer.MAX_VALUE;
        String res = "";

        for(int i =0 ;i<m;i++){
            arr2[t.charAt(i)]++;

        }
        for(int r  = 0;r<n;r++){
            char ch = s.charAt(r);
            arr1[ch]++;

            if(arr1[ch]<=arr2[ch]){
                count++;
            }
            while(count==m){
                if(r-l+1 < len){
                    len = r-l+1;
                    res = s.substring(l,r+1);
                } 
                char lch = s.charAt(l);
                arr1[lch]--;
                if(arr1[lch]<arr2[lch]) count--;
                l++;
            }


        }
        return res;

    }
}