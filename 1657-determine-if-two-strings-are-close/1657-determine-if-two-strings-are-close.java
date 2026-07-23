class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        if(word1.length()!= word2.length()) return false;
        for(char ch : word1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch : word2.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if(map1.size()!=map2.size()) return false;
        if(!(map1.keySet().equals(map2.keySet()))) return false;

        for(int count : map1.values()){
            one.add(count);
        }
        for(int count : map2.values()){
            two.add(count);
        }
        Collections.sort(one);
        Collections.sort(two);
        if(one.equals(two)) return true;
        else return false;
    }
}