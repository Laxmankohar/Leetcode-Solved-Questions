class Solution {
    public int[][] largestLocal(int[][] grid) {
        int [][] ans = new int[grid.length-2][grid.length-2];
        
        for(int i=0;i<ans.length;++i){
            for(int j =0; j<ans.length;++j){
                
                int largest = Integer.MIN_VALUE;
                
                for(int r = i; r < i+3;++r){
                    for(int c = j; c < j+3; c++){
                        largest = Math.max(largest, grid[r][c]);
                    }
                }
                ans[i][j] = largest;
            }
        }
        return ans;
    }
}

//         int[][] result = new int[grid.length - 2][grid.length - 2];

//         for (int i = 0; i < result.length; ++i) {
//             for (int j = 0; j < result.length; ++j) {
			
//                 int largest = Integer.MIN_VALUE;
//                 for (int row = i; row < i + 3; ++row) {
//                     for (int column = j; column < j + 3; ++column) {
//                         largest = Math.max(largest, grid[row][column]);
//                     }
//                 }
//                 result[i][j] = largest;
//             }
//         }
//         return result;
