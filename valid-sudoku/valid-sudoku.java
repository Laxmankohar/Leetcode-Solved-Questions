class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> cols = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
        for (int j = 0; j < 9;j++) {
            if(board[i][j]!='.' && !rows.add(board[i][j]))
                return false;
            if(board[j][i]!='.' && !cols.add(board[j][i]))
                return false;
            int cubeRow = 3*(i/3) + j/3;
            int cubeCol = 3*(i%3) + j%3;
            if(board[cubeRow][cubeCol]!='.' && !cube.add(board[cubeRow][cubeCol]))
                return false;
        }
    }
    return true;
    }
}