// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            int[] ans = ob.changeBits(N);
            System.out.println(ans[0]+ " "+ ans[1]);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] changeBits(int N) {
        // code here
        int num = N, sum = 0, i = 0;
        
        int[] arr = new int[2];
        
        while(num > 0){
            sum += (int)Math.pow(2,i);
            num /= 2;
            i++;
        }
        
        arr[0] = sum - N;
        arr[1] = sum;
        
        return arr;
    }
};