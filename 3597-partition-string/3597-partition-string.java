class Solution {
    public List<String> partitionString(String s) {
        ArrayList<String> res = new ArrayList<>();
        HashSet<String> map = new HashSet<>();
        int n = s.length();
        String temp = "";
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            temp+=ch;
            if(!map.contains(temp)){
                map.add(temp);
                res.add(temp);
                temp = "";
            }
           
        }
        return res;


    }
}