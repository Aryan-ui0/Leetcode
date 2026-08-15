class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time = 0;
        int start = 0;
        for(int num : requests){
            time += Math.abs(num-start);
            start = num;
        }
        return time;
    }
}