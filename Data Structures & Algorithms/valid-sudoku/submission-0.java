class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] grid = new HashSet[9];

        for(int i=0; i<9; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            grid[i] = new HashSet<>();
        }

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(board[i][j] == '.') {
                    continue;
                }

                int boxid = (i/3)*3 + j/3;

                if(row[i].contains(board[i][j]) ||
                col[j].contains(board[i][j]) ||
                grid[boxid].contains(board[i][j])) {
                    return false;
                }
                row[i].add(board[i][j]);
                col[j].add(board[i][j]);
                grid[boxid].add(board[i][j]);

            }
        }
        return true;

    }
}
