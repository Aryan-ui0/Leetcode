class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int ans = 0;
        HashMap<ArrayList<Integer>,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0;j<n;j++){
                row.add(grid[i][j]);
            }
            map.put(row,map.getOrDefault(row,0)+1);
        }

        for(int i = 0;i<n;i++){
            ArrayList<Integer> col = new ArrayList<>();
            for(int j = 0;j<n;j++){
                col.add(grid[j][i]);
            }
            ans+= map.getOrDefault(col,0);
        }
        return ans;
    }
}