class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> freqmap = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : map.keySet()){
            int temp = map.get(num);
            freqmap.put(temp,freqmap.getOrDefault(temp,0)+1);
        }
        for(int num : freqmap.keySet()){
            int temp = freqmap.get(num);
            if(temp>1) return false;
        }
        return true;
    }
}