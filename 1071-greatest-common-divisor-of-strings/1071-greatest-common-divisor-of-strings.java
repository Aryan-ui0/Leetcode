class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String res = "";
        int n = str1.length();
        int m = str2.length();
        if(!((str1 + str2).equals(str2+str1) )) return res;
        return str1.substring(0,gcd(n,m));
        
      
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}