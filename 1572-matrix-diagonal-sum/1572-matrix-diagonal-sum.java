class Solution {
    public int diagonalSum(int[][] mat) {
        int personal = 0;
        int n = mat.length;
        
        for(int i = 0; i<n;i++){
                    personal += mat[i][i] + mat[i][n-i-1];
            
        }
         return n % 2 == 0 ? personal : personal - mat[n/2][n/2];
    }
}