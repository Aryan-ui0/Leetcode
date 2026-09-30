class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder res = new StringBuilder();
        HashMap<String,String> map = new HashMap<>();
        for(List<String> pair : knowledge){
            map.put(pair.get(0),pair.get(1));
        }
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                int j =i+1;
                while(s.charAt(j)!=')'){
                    j++;
                }
                String str = s.substring(i+1,j);
                if(map.containsKey(str)) res.append(map.get(str));
                else res.append("?");
                i = j+1;

            }
            else{
                res.append(s.charAt(i));
                i++;
            }
        }
        return res.toString();

    }
}