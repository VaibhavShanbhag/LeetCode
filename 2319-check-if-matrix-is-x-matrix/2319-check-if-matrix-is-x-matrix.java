class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        
        for(int i=0; i<n; i++){
            if(grid[i][i] == 0)
                return false;
        }
        
        int k = n-1;
        
        for(int i=0; i<n; i++){
            if(grid[i][k--] == 0)
                return false;
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j || (i+j) == (n-1))
                    continue;
                
                else if(grid[i][j] != 0)
                    return false;
            }
        }
        
        return true;
    }
}