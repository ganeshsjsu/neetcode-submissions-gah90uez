class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n  = board.length;
        boolean[][] rowCheck = new boolean[9][9];
        boolean[][] colCheck = new boolean[9][9];
        boolean[][] boxCheck = new boolean[9][9];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == '.') continue;
                int val = board[i][j] - '1';
                int box = i/3 + (j/3)*3;
                if(rowCheck[i][val] || colCheck[j][val] || boxCheck[box][val] ) return false;
                rowCheck[i][val] = true;
                colCheck[j][val] = true;
                boxCheck[box][val] = true;
            }
        }

        return true;
    }
}
