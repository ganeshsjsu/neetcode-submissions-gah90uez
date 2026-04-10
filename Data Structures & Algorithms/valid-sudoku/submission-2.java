class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];


        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(board[i][j] == '.') continue;
                if(rows[i] != null && rows[i].contains(board[i][j])) {
                    return false;
                }
                if(rows[i] == null) rows[i] = new HashSet<>();
                rows[i].add(board[i][j]);

                if(cols[j] != null && cols[j].contains(board[i][j])) {
                    return false;
                }
                if(cols[j] == null) cols[j] = new HashSet<>();
                cols[j].add(board[i][j]);

                int box = (j/3)*3 + (i/3);
                if(boxes[box] != null && boxes[box].contains(board[i][j])) {
                    return false;
                }
                if(boxes[box] == null) boxes[box] = new HashSet<>();
                boxes[box].add(board[i][j]);

            }
        }

        return true;
    }
}
