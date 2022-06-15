class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);

        for(int i=0; i<m; i++){
            int count = count(mat[i]);
            pq.add(new int[]{i,count});
        }
        
        int[] ans = new int[k];
        
        for(int i=0; i<k; i++){
            ans[i] = pq.remove()[0];
        }
        
        return ans;
    }
    
    public int count(int[] arr){
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1)
                count++;
        }
        
        return count;
    }
}